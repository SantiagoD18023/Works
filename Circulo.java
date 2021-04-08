/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;

/**
 *
 * @author 57322
 */
public class Circulo implements Forma {
    private float radio;
    private float x;
    private float y;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float DarArea() {
        double area=radio*Math.pow(Math.PI, 2);
        return (float) area;
    }
    
}
