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
public class DoublyLinkedList {
        //atributos LinkedList
    public DoublyNode head;
    public DoublyNode current;
  

    public DoublyLinkedList(){
        this.head = this.current = null;
    }
    
    //Para saber si la lista esta vacia
   public boolean Vacia(){
       boolean vacia = false;
       if (head == null){
           vacia = true;
       }
       return vacia;
   }
   
   //Insertar al inicio
   public void insert(Object element){
       DoublyNode nuevo = new DoublyNode(element);
       if (Vacia()){
           head = current = nuevo;
       }else{
           nuevo.next = head;
           head.previous = nuevo;
           head = nuevo;
       }
   }
   
   //Insertar al final
   public void insertEnd(Object element){
       DoublyNode nuevo = new DoublyNode();
       if (Vacia()){
           head = current = nuevo;
       }else {
           current.next = nuevo;
           nuevo.previous = current;
           current = nuevo;
       }
   }
   
   //eliminar de la lista
   public void remove(Object entrada) throws Exception{
       DoublyNode actual;
       boolean encontrado = false;
       actual = head;
       
       while ((actual != null) && (!encontrado)){
           encontrado = (actual.element == entrada);
           if (actual != null){
               //Para diferenciar entre el head y otra parte de la lista
               if (actual == head){
                   head = actual.next;
                   if (actual.next != null){
                       actual.next.previous = null;
                   }
               }else if (actual.next != null){
                   actual.previous.next = actual.next;
                   actual.next.previous = actual.previous;
               }else{
                   actual.previous.next = null;
               }
               if (actual == current){
                   current = actual.previous;
               }
               actual = null;
           }
       }  
   }
   
  
}
