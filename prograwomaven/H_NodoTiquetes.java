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
public class H_NodoTiquetes <T>{
       //atributos

    private T element;
    private H_NodoTiquetes<T> next;

    //Constructores
    public H_NodoTiquetes() {
        this.element = null;
        this.next = null;
    }

    public H_NodoTiquetes(T element) {
        this.element = element;
        this.next = null;
    }

    public H_NodoTiquetes(T element, H_NodoTiquetes<T> next) {
        this.element = element;
        this.next = next;
    }

    //metodos

    public T getElement() {
        return this.element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public H_NodoTiquetes<T> getNext() {
        return this.next;
    }

    public void setNext(H_NodoTiquetes<T> next) {
        this.next = next;
    }
}
