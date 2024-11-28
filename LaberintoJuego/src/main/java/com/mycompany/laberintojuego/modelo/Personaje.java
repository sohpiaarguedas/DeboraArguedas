/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintojuego.modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Personaje extends Elemento {

    protected int fila;
    protected int columna;

    public Personaje(int x, int y, int columna, int fila, ImageIcon imagen) {
        super(x, y, imagen);
        this.fila = fila;
        this.columna = columna;

    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    
    
    // Aqui meti mover el capibara
    public void mover() {
        x = x + 10;
       // y=y+5;

      

    }
    
    
}
