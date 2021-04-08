/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author 57322
 */
public class Profesor extends Empleado{
    public float nTarjeta;
    public Profesor(float cedula,float nTarjeta) {
        super(cedula);
        this.nTarjeta=nTarjeta;
    }
   public void dictarClase(){
       
   }
}
