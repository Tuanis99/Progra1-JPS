/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograwomaven;

public class A_InicioPrograma {
    //Inician lsitas que se utilizaran dentro del programa
    public static B_ListaJPS JPSDATA = new B_ListaJPS();
    public static G_ListaTiquetes TiquetesGenerados= new G_ListaTiquetes();
    public static void main(String[] args) {
        D_pantallaInicio main_interfaz = new D_pantallaInicio();
        main_interfaz.setVisible(true);
        main_interfaz.setLocationRelativeTo(null);
        main_interfaz.setDefaultCloseOperation(D_pantallaInicio.DO_NOTHING_ON_CLOSE);
    }
    
}
