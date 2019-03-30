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
public class DoublyNode {
    //Declaracion de variables
    public Object element;
    public DoublyNode next;
    public DoublyNode previous;

    //Constructores
    public DoublyNode() {
    }

    public DoublyNode(Object element) {
        this.element = element;
        this.next = null;
        this.previous = null;
        }

    //métodos
    public Object getElement() {
        return this.element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public DoublyNode getNext() {
        return this.next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public DoublyNode getPrevious() {
        return this.previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }
  
}
