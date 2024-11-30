/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintojuego.modelo;

/**
 *
 * @author Usuario
 */
public class Laberinto {

    private int[][] laberinto;

    public Laberinto() {

//        0 donde se transita
//                1 donde no
//                2 obstaculo
//
        int[][] laberinto = {
            
            {1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,1,0,1,0,0,1},
            {1,0,1,0,0,0,0,0,0,0},
            {0,0,1,1,1,0,0,1,0,0},
            {1,0,0,0,0,0,1,0,0,1},
            {1,0,1,1,0,0,0,1,0,1},
            {1,1,1,1,1,1,1,1,1,1}
        };
            
            
//            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//            {0, 0, 0, 0, 1, 0, 1, 2, 0, 1},
//            {1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//            {0, 0, 1, 1, 1, 0, 0, 1, 0, 0},
//            {1, 0, 0, 0, 0, 0, 1, 2, 0, 1},
//            {1, 2, 1, 1, 0, 0, 0, 1, 0, 1},
//            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        

        this.laberinto = laberinto;
    }

    public int getCelda(int fila, int columna) {
        

         return laberinto[fila][columna];
        
    }

}
