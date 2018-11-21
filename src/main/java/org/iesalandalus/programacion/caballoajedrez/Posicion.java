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
public class Posicion {
    
    private int fila;
    private char columna;

   // Getter y Setter Fila
    
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) throws IllegalArgumentException {
        if(fila>=1 && fila<=8){
            
        this.fila = fila;
        
        }else{
            
            System.out.println("El número introducido no corresponde a ninguna fila del tablero");
        }
    }
       

    // Getter y Setter Columna
    
    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) throws IllegalArgumentException {
       char a='a';
       char h='h';
     
        if((int)columna>=(int)a && (int)columna<=(int)h){
        
        this.columna = columna;
        
        }else{
                
        System.out.println("La letra introducida no corresponde a ninguna columna del tablero");
        
        }
     
    }
    
    
    // Constructores:
    
    public Posicion(int fila, char columna)throws IllegalArgumentException {
        char a='a';
        char h='h';
        
        if(fila>=1 && fila<=8){
            
        this.fila = fila;
        
        }else{
            
            System.out.println("El número introducido no corresponde a ninguna fila del tablero");
       
        }
        
        if((int)columna>=(int)a && (int)columna<=(int)h){
        
        this.columna = columna;
        
        }else{
                
        System.out.println("La letra introducida no corresponde a ninguna columna del tablero");
        
        }   
    }
    
    //Constructor Copia
    
    public Posicion (final Posicion y){
        
        this.fila = y.fila;
        this.columna = y.columna;
    }
    
    
    //Método Equals Ejercicio 9.

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.fila;
        hash = 79 * hash + this.columna;
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
        final Posicion other = (Posicion) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (this.columna != other.columna) {
            return false;
        }
        return true;
    }
    
   
    //Método toString. Ejercicio 10.

    @Override
    public String toString() {
        return "Posicion{" + "fila=" + fila + ", columna=" + columna + '}';
    }
    
    
 
    }
   



