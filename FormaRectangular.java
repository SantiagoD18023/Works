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
public class FormaRectangular implements Forma {
protected float ancho;
protected float alto;
protected float x;
protected float y;

    public FormaRectangular(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }


    @Override
    public float DarArea() {
    float area=ancho*alto;
        return area;   
    }
    
}
