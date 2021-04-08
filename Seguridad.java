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
public class Seguridad extends Empleado{
    private float nmatricula;
    private int municionPistola=5;
    public Seguridad(float cedula,float matricula) {
        super(cedula);
        this.nmatricula=matricula;
    }
    public void disparar(){
        
    }
    
}
