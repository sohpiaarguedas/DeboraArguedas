/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintojuego.modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class AreaJuego {

    private Laberinto laberinto;
    private Principal principal;

    private Personaje capi;
    private int coordenadasX[] = {2, 65, 130, 197, 277, 344, 426, 494, 565, 640};
    private int coordenadasY[] = {100, 170, 260, 340, 410, 480, 560};
    private Enemigo enemigo;

    public AreaJuego() {

        laberinto = new Laberinto();
        principal = new Principal(coordenadasX[0], coordenadasY[1], 0, 1, new ImageIcon("./src/main/resources/imgP/capibara2.gif"));
        posicionarPersonajes();

    }

    public void posicionarPersonajes() {

        capi = new Personaje(coordenadasX[0], coordenadasY[1], 0, 1, new ImageIcon("./src/main/resources/imgP/capibara2.gif"));
        System.out.println("El personaje esta fila: " + capi.getFila() + " columna: " + capi.getColumna() + ", x: " + capi.getX() + "y: " + capi.getY());
        enemigo = new Enemigo(coordenadasX[5], coordenadasY[3], 5, 3, new ImageIcon("./src/main/resources/imgP/mapachePerfil2.gif"));

    }

    public void moverEnemigo() {
        int vidas;
        vidas = principal.getVidas();
        enemigo.mover();
        if ((isValido(enemigo.getFila(), enemigo.getColumna())) && (laberinto.getCelda(enemigo.getFila(), enemigo.getColumna()) == 0)) {

            enemigo.setX(coordenadasX[enemigo.getColumna()]);
            enemigo.setY(coordenadasY[enemigo.getFila()]);
            if (isColision(enemigo)) {
                vidas--;
                principal.setVidas(vidas);
                if (vidas >= 0) {
                    System.out.println("Chocaste!. Te quedan " + principal.getVidas() + " vidas");
                }

                if (vidas <= 0) {
                    System.out.println("Perdio");
                }
            }

        }
    }

    //Metodos para que gane
    public boolean meta() {
        if (capi.getFila() == 3 && capi.getColumna() == 9 && principal.getVidas() > 0) {

            return true;
        }
        return false;
    }

    public String ganar() {
        if (meta()) {
            return "Felicidades, gano";
        }
        return null;

    }

    public boolean isColision(Enemigo enemigo) {
        if (capi.getFila() == enemigo.getFila() && capi.getColumna() == enemigo.getColumna()) {
            return true;
        }
        return false;
    }

    public void moverCapi() {
        capi.mover();
    }

    public void dibujar(Graphics g) {
        capi.show(g);
        enemigo.show(g);

    }

    public void dibujarEnemigo() {

    }

    public void caminar(String direccion) {
        int filaDestino = capi.getFila();
        int columnaDestino = capi.getColumna();
        //System.out.println("primera vez fila destino " + filaDestino + ", columna destino: " + columnaDestino);
        switch (direccion) {
            case "arriba":
                filaDestino--;
                break;

            case "abajo":
                filaDestino++;
                break;

            case "derecha":
                columnaDestino++;
                break;

            case "izquierda":
                columnaDestino--;
                break;

        }
//        System.out.println("Despues del switch  fila destino " + filaDestino + ", columna destino: " + columnaDestino);
        if ((isValido(filaDestino, columnaDestino)) && (laberinto.getCelda(filaDestino, columnaDestino) == 0)) {
            capi.setFila(filaDestino);
            capi.setColumna(columnaDestino);
            capi.setX(coordenadasX[columnaDestino]);
            capi.setY(coordenadasY[filaDestino]);

        }
    }

    public boolean isValido(int filaDestino, int columnaDestino) {

        // System.out.println("isValido fila destino " + filaDestino + ", columna destino: " + columnaDestino);
        if (filaDestino > 0 && filaDestino < 6 && columnaDestino > 0 && columnaDestino < 10) {
            //  System.out.println("Sirve");
            return true;
        }
        return false;
    }

}
