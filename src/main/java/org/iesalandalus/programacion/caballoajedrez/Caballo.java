/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

import java.util.Objects;
import javax.naming.OperationNotSupportedException;

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
    
    // Ejercicio 14. Constructor con un solo parámetro.
    // Tengo dudas de si emplear color.equals(Color.BLANCO) o color == Color.Blanco
    //como son dos objetos emplearé equals.
    
    
     public Caballo(Color color){
        
        if(color.equals(Color.BLANCO)){
          
          this.color = Color.BLANCO;
          this.posicion = new Posicion(1,'b');
          
        }else{
            
          this.color = Color.NEGRO;
          this.posicion = new Posicion(8,'b');
          
        }
     
    }
     
     
     // Ejercicio 15. Constructor de dos parámetros
     
     
     
      public Caballo(Color color, char columna) throws IllegalArgumentException{
          
        if(color.equals(Color.BLANCO)){
          
          this.color = Color.BLANCO;
          this.posicion= new Posicion(1,columna);
          
        }
        if(color.equals(Color.NEGRO)){
            
          this.color = Color.NEGRO;
          this.posicion = new Posicion(8,columna);
          
        }
        if(columna!='b' && columna!='g'){
            System.out.println("El caballo debe iniciar en la columna b o la columna g");
        }
              
      }
        
      //Ejercicio 17. Metodo mover, para lanzar la excepcion he tenido que importar un paquete.
      
      public void mover(Direccion direccion) throws OperationNotSupportedException{
         
          int y = posicion.getFila();
          char x = posicion.getColumna();
          int arriba, abajo;
          char izquierda, derecha;
          
          if(direccion.equals(Direccion.ARRIBA_DERECHA)){
             
              arriba = y+2;
              derecha = ++x;        
              posicion.setFila(arriba);
              posicion.setColumna(derecha);
          }
          
          if(direccion.equals(Direccion.ARRIBA_IZQUIERDA)){
          
              arriba = y+2;
              izquierda = --x;
              
              posicion.setFila(arriba);
              posicion.setColumna(izquierda);
          }
      
           if(direccion.equals(Direccion.ABAJO_DERECHA)){
          
               abajo = y-2;
               derecha = ++x;
              
              posicion.setFila(abajo);
              posicion.setColumna(derecha);
          }
           
           if(direccion.equals(Direccion.ABAJO_IZQUIERDA)){
          
               abajo = y-2;
               izquierda = --x;
              
              posicion.setFila(abajo);
              posicion.setColumna(izquierda);
          }
           
            if(direccion.equals(Direccion.DERECHA_ARRIBA)){
          
               arriba = y+1;
               derecha =(char)(x+2);
              
              posicion.setFila(arriba);
              posicion.setColumna(derecha);
          }
      
             if(direccion.equals(Direccion.DERECHA_ABAJO)){
          
               abajo = y-1;
               derecha = (char)(x+2);
              
              posicion.setFila(abajo);
              posicion.setColumna(derecha);
          }
      
             if(direccion.equals(Direccion.IZQUIERDA_ABAJO)){
          
               abajo = y-1;
               izquierda = (char)(x-2);
              
              posicion.setFila(abajo);
              posicion.setColumna(izquierda);
          }
             
             if(direccion.equals(Direccion.IZQUIERDA_ARRIBA)){
          
               arriba = y+1;
               izquierda = (char)(x-2);
              
              posicion.setFila(arriba);
              posicion.setColumna(izquierda);
              
          }else{
            
                 System.out.println("El caballo se sale de las dimensiones del tablero");    
             }
      }

      
      // Ejercicio 18. Método equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.color);
        hash = 79 * hash + Objects.hashCode(this.posicion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caballo other = (Caballo) obj;
        if (this.color != other.color) {
            return false;
        }
        if (!Objects.equals(this.posicion, other.posicion)) {
            return false;
        }
        return true;
    }
      
    
    // Ejercicio 19. Método toString

    @Override
    public String toString() {
        return "Caballo{" + "color=" + color + ", posicion=" + posicion + '}';
    }
    
    
      
        
     
}
