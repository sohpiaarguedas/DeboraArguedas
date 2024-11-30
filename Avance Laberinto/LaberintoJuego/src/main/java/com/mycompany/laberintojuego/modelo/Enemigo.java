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
public class Enemigo extends Personaje {

    private int direccion;

    public Enemigo(int x, int y, int columna, int fila, ImageIcon imagen) {
        super(x, y, columna, fila, imagen);
        direccion = 0;
    }

    public void mover() {

        if (direccion == 0 && (fila > 0 && fila < 6)) {

            fila--;
            if (fila == 0) {
                direccion = 0;
                fila = 5;

            }
        }

        if ((direccion == 0) && (fila > 0) && (fila > 6)) {
            fila++;
            if (fila == 6) {
                direccion = 0;
            }
        }

//x = x + 10;
        //  y=y+10;
        //otra forma de acceder al atributo cuando es 
        //privado en la clase padre :  setY(getY()-10);
        {

        }
    }
}
