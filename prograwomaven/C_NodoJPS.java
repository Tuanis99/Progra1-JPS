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
public class C_NodoJPS {
    public Object element;
    public C_NodoJPS next;
    
    public C_NodoJPS(){
        
    }
    public C_NodoJPS(Object element){
        this.element = element;
        this.next = null;
        
    }
    public C_NodoJPS(Object element,C_NodoJPS next){
        this.element= element;
        this.next=next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public C_NodoJPS getNext() {
        return next;
    }

    public void setNext(C_NodoJPS next) {
        this.next = next;
    }
    
}
