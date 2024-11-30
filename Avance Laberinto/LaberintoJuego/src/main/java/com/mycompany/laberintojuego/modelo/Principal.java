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
public class Principal extends Personaje {

    private int vidas;

    
    
    public Principal(int x, int y, int columna, int fila, ImageIcon imagen) {
        super(x, y, columna, fila, imagen);
        vidas = 3;
    }
    
    
   

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    
}
