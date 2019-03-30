/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograwomaven;

/**
 *
 * @author luisg
 */
public class Pila <T> {
    private H_NodoTiquetes<T> top;
    private int size;

    public Pila() {
        this.top = null;
        this.size = 0;
    }

    public void push(T element) {
        this.top = new H_NodoTiquetes<>(element, this.top);
        this.size++;
    }

    public T pop(){
        if (this.top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        T temp = this.top.getElement();
        this.top = this.top.getNext();
        this.size--;
        return temp;
    }

    public T top(){
        if (this.top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        return this.top.getElement();
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        this.top = null;
        this.size = 0;
    }

    public String toString(){
        String result = "*LStack*\n";
        H_NodoTiquetes<T>temp = top;
        while(temp != null){
            result+= temp.getElement() + "\n";
            temp = temp.getNext();
        }
        return result;
}
}
