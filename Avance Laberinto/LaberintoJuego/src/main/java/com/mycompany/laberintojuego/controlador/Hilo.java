/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintojuego.controlador;

import com.mycompany.laberintojuego.modelo.AreaJuego;

/**
 *
 * @author Usuario
 */
public class Hilo extends Thread {

    private AreaJuego areaJuego;
    private ControladorLaberinto controladorLaberinto;
    private boolean estado;

    public Hilo(ControladorLaberinto controladorLaberinto) {
        this.controladorLaberinto = controladorLaberinto;
        areaJuego = new AreaJuego();
        estado = true;

    }

    public void run() {

        while (true) {
            try {
                if (estado) {
                    controladorLaberinto.moverEnemigo(); // Mueve al enemigo
                    

                    if (controladorLaberinto.isGanar()) {
                        controladorLaberinto.ganar(); // Metodo para decir que gano
                        estado = false;

                    }//fin otro if

                }//fin del if

                sleep(200);

            }//fin del try
            catch (InterruptedException ex) {

                System.out.println("" + ex);

            }

        }//fin del while

    }

}
