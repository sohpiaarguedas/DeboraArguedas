/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintojuego.controlador;

import com.mycompany.laberintojuego.modelo.AreaJuego;
import com.mycompany.laberintojuego.vista.GUIInterfaz;
import com.mycompany.laberintojuego.vista.PanelInterfaz;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Usuario
 */
public class ControladorLaberinto implements KeyListener {

    private GUIInterfaz guiLaberinto;
    private PanelInterfaz panelLaberinto;
    private AreaJuego areaJuego;

    public ControladorLaberinto(GUIInterfaz guiLaberinto) {

        this.guiLaberinto = guiLaberinto;
        areaJuego = new AreaJuego();
    }

    public void setPanelLaberinto(PanelInterfaz panelLaberinto) {
        this.panelLaberinto = panelLaberinto;
    }

    public void moverEnemigo() {
        areaJuego.moverEnemigo();
        panelLaberinto.repaint();
    }

    public void dibujar(Graphics g) {
        areaJuego.dibujar(g);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                areaJuego.caminar("arriba");
                break;

            case KeyEvent.VK_DOWN:
                areaJuego.caminar("abajo");
                break;

            case KeyEvent.VK_LEFT:
                areaJuego.caminar("izquierda");
                break;

            case KeyEvent.VK_RIGHT:
                areaJuego.caminar("derecha");
                break;
        }

       // System.out.println("Toco un tecla"+e.getKeyCode());
       
         

    

}

@Override
public void keyReleased(KeyEvent e) {

    }

}
