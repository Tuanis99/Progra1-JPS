/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograwomaven;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author luisg
 */
public class Hh_Tiquetes {
    public String nombre;
    public String cliente;
    public String sorteo;
    public int numero;
    //public int precio;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getSorteo() {
        return sorteo;
    }

    public void setSorteo(String sorteo) {
        this.sorteo = sorteo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

//    public int getPrecio() {
//        return precio;
//    }
//
//    public void setPrecio(int precio) {
//        this.precio = precio;
//    }
    
    

    public Hh_Tiquetes(String nombre, String cliente, String sorteo, int numero /*int precio*/) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.sorteo = sorteo;
        this.numero = numero;
        //this.precio = precio;
    }

    public Hh_Tiquetes() {
    }
    
   public void insertarTiquete(){
        if(" ".equals(Ii_GenerarTiquete.NombreEmisor.getText()) || " ".equals(Ii_GenerarTiquete.NombreCliente.getText()) || " ".equals(Ii_GenerarTiquete.cbSorteo.getSelectedItem()) || " ".equals(Ii_GenerarTiquete.Numerotxt.getText())){
           JOptionPane.showMessageDialog(null,"De", "Error",JOptionPane.PLAIN_MESSAGE);
           return;
                }
        try{
            String nombreEmisor= Ii_GenerarTiquete.NombreEmisor.getText();
            String nombreCliente= Ii_GenerarTiquete.NombreCliente.getText();
            String tipoSorteo= Ii_GenerarTiquete.cbSorteo.getSelectedItem().toString();
            int numeroSorteo=Integer.parseInt(Ii_GenerarTiquete.Numerotxt.getText());
            //String PrecioTiquete = Integer.parseInt(Ii_GenerarTiquete.PrecioTiquetetxt.getText());
            
            boolean insertar=true;
               A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.head.getNext();
               //Comprueba que el libro no exista, para asi poder agregarlo
               while(A_InicioPrograma.JPSDATA.current.getNext()!=null){
                   if(A_InicioPrograma.JPSDATA.current.element.numero.equals(N_Interfaz_seleccionar_libreria.entrada_name.getText())){
                       A_InicioPrograma.JPSDATA.current.getElement().libros.goToStart();
                       while(A_InicioPrograma.JPSDATA.current.getElement().libros.current.getNext()!=null){
                           if(A_InicioPrograma.JPSDATA.current.getElement().libros.current.getElement().nombre.equals(numeroSorteo)){
                               JOptionPane.showMessageDialog(null,"Debe ingresar un nombre diferente","Error",JOptionPane.PLAIN_MESSAGE);
                               return;
                            }
                            A_InicioPrograma.JPSDATA.current.getElement().libros.current=A_InicioPrograma.JPSDATA.current.getElement().libros.current.getNext();
                        }
                   }
                   A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
                if(insertar==true){
                   //Asigana nuevos valores
                   this.nombre=nombreEmisor;
                   this.cliente=nombreCliente;
                   this.numero=numeroSorteo;
                   this.sorteo=tipoSorteo;
                   
                   JOptionPane.showMessageDialog(null,"Se insertó de manera correcta","Éxito", JOptionPane.PLAIN_MESSAGE);
                   Ii_GenerarTiquete.success=true;
               }
               else{
                   JOptionPane.showMessageDialog(null,"El identificador debe ser diferente","Error",JOptionPane.PLAIN_MESSAGE);
               }
        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(null,"Debe de ingresar todos los datos","Error", JOptionPane.PLAIN_MESSAGE);

        }
}
}
