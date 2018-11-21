/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

/**
 *
 * @author Ezk24
 */
public class Caballo {
    
   //Ejercicio 11. 
    
    private Color color;
    private Posicion posicion;
    
    //Ejercicio 12
   //getter y setter de color:

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
    // getter y setter de posicion:
    
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
    // Ejercicio 13. Creo constructor por defecto:

    public Caballo() {
        this.color = Color.NEGRO;
        this.posicion = new Posicion(8,'b');
                
    }
    
    
    
    
}
