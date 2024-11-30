/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintojuego.controlador;

import com.mycompany.laberintojuego.modelo.Laberinto;
import com.mycompany.laberintojuego.vista.GUIHistoria;
import com.mycompany.laberintojuego.vista.GUIInstrucciones;
import com.mycompany.laberintojuego.vista.GUIInterfaz;
import com.mycompany.laberintojuego.vista.PanelInterfaz;

//import com.mycompany.laberintojuego.vista.GUIInterfazG;
import com.mycompany.laberintojuego.vista.GUIPrincipal;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Usuario
 */
public class ControladorJuego implements ActionListener, MouseListener {

    private GUIInstrucciones guiInstrucciones;
    private GUIPrincipal guiPrincipal;
    private GUIHistoria guiHistoria;
    private GUIInterfaz guiInterfaz;
    private PanelInterfaz panelLaberinto;
    private Hilo hilo;
    private ControladorLaberinto controladorLaberinto;

    public ControladorJuego() {
        guiPrincipal = new GUIPrincipal(this);

        guiInstrucciones = new GUIInstrucciones();
        guiInterfaz = new GUIInterfaz();

        guiHistoria = new GUIHistoria();
        guiInterfaz.escucharTeclado(controladorLaberinto);
        guiPrincipal.setVisible(true);

        panelLaberinto = guiInterfaz.getPanelInterfaz1();
        controladorLaberinto = new ControladorLaberinto(guiInterfaz);
        controladorLaberinto.setPanelLaberinto(panelLaberinto);
        guiInterfaz.setFocusable(true);
        guiInterfaz.requestFocusInWindow();
        guiInterfaz.escucharTeclado(controladorLaberinto);

        hilo = new Hilo(controladorLaberinto);

        guiInstrucciones.escuchar(this);

        panelLaberinto.setControlador(controladorLaberinto);
        guiInterfaz.escuchar(this);
        guiInterfaz.escucharClick(this);
        guiHistoria.escuchar(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "instrucciones":
                guiPrincipal.setVisible(false);
                guiInstrucciones.setVisible(true);

                break;

            case "jugar":
                guiInterfaz.setVisible(true);

                hilo.start();
                break;

            case "salir":
                System.exit(0);
                break;

            case "historia":
                guiPrincipal.setVisible(false);
                guiHistoria.setVisible(true);
                break;

            case "salirInstrucciones":
                guiInstrucciones.setVisible(false);
                guiPrincipal.setVisible(true);
                break;

            case "btnSalirHistoria":
                guiInstrucciones.setVisible(false);
                guiPrincipal.setVisible(true);
                break;

            case "exit":

                guiInterfaz.setVisible(false);
                
                guiPrincipal.setVisible(true);
                break;

        }//fin del switch

    }// fin del actionPerformed

    public void dibujar(Graphics g) {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        int x = e.getX();
        int y = e.getY();

        // Mostrar las coordenadas en consola
        System.out.println("Presionó la coordenada X: " + x + ", Y: " + y);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
