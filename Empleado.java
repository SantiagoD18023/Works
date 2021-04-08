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
public class Empleado implements Persona{
    protected float cedula;

    public Empleado(float cedula) {
        this.cedula = cedula;
    }
    public void cobrarSueldo(){
        
    }
    public void pagarImpuestos(){
        
    }
    public void asistirReunion(){
        
    }

    @Override
    public void registrarEntrada() {
        }

    @Override
    public void registarSalida() {
        }
}
