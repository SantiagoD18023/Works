/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;

import javax.swing.JOptionPane;

/**
 *
 * @author 57322
 */
public class Dibujo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FormaRectangular f1=new Rectangulo(20,10);
        JOptionPane.showMessageDialog(null,"Área del rectangulo: "+f1.DarArea());
        FormaRectangular f2=new Cuadrado(5,5);
        JOptionPane.showMessageDialog(null,"Área del cuadrado: "+f2.DarArea());
        Circulo c1=new Circulo(2);
        JOptionPane.showMessageDialog(null,"Área del circulo: "+c1.DarArea());
    }
    
}
