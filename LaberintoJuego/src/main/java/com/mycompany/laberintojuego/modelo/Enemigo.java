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

    public Enemigo(int x, int y, int columna, int fila, ImageIcon imagen) {
        super(x, y, columna, fila, imagen);

    }

    public void mover(int y) {
        
        
        
        
        //x = x + 10;
        y=y+10;

       
        

        //otra forma de acceder al atributo cuando es 
        //privado en la clase padre :  setY(getY()-10);
    }
}
