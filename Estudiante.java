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
public class Estudiante implements Persona{
    protected float cedula;
    protected float codigoEstudiantil;

    public Estudiante(float cedula, float codigoEstudiantil) {
        this.cedula = cedula;
        this.codigoEstudiantil = codigoEstudiantil;
    }
    
    @Override
    public void registrarEntrada() {
        }

    @Override
    public void registarSalida() {
        }
    public void pagarMatricula(){
        
    }
    public void asistirClase(){
        
    }
    public void lectura(){
        
    }
    public void entregarTrabajo(){
        
    }
}
