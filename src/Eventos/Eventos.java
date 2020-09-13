/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import Colores.Colores;
import Ventana.Ventana;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author diosl
 */
public class Eventos implements MouseListener {

    Colores colores = new Colores();

    private Ventana ventanaPrincipal;

    public Eventos(Ventana ventana) {

        this.ventanaPrincipal = ventana;

        ventanaPrincipal.getBtnHome().addMouseListener(this);
        ventanaPrincipal.getBtnBar().addMouseListener(this);
        ventanaPrincipal.getBtnHistory().addMouseListener(this);
        ventanaPrincipal.getBtnFile().addMouseListener(this);
    }

    private boolean booBtnInicio = true;
    private boolean booBtnBar = false;
    private boolean booBtnHistory = false;
    private boolean booBtnFile = false;

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        if (e.getSource() == ventanaPrincipal.getBtnHome()) {

            ventanaPrincipal.getBtnHome().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home1.png")));
            ventanaPrincipal.getColor().setBackground(colores.getColorPrymary2());
            booBtnInicio = true;

            ventanaPrincipal.getBtnBar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bar2.png")));
            ventanaPrincipal.getColor1().setBackground(colores.getGris1());
            booBtnBar = false;
            
            ventanaPrincipal.getBtnHistory().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/history2.png")));
            ventanaPrincipal.getColor2().setBackground(colores.getGris1());
            booBtnHistory = false;
            
            ventanaPrincipal.getBtnFile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/file2.png")));
            ventanaPrincipal.getColor3().setBackground(colores.getGris1());
            booBtnFile = false;
        }
        
         if (e.getSource() == ventanaPrincipal.getBtnBar()) {

            ventanaPrincipal.getBtnHome().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home2.png")));
            ventanaPrincipal.getColor().setBackground(colores.getGris1());
            booBtnInicio = false;

            ventanaPrincipal.getBtnBar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bar1.png")));
            ventanaPrincipal.getColor1().setBackground(colores.getColorPrymary2());
            booBtnBar = true;
            
            ventanaPrincipal.getBtnHistory().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/history2.png")));
            ventanaPrincipal.getColor2().setBackground(colores.getGris1());
            booBtnHistory = false;
            
            ventanaPrincipal.getBtnFile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/file2.png")));
            ventanaPrincipal.getColor3().setBackground(colores.getGris1());
            booBtnFile = false;
        }
         
         if (e.getSource() == ventanaPrincipal.getBtnHistory()) {

            ventanaPrincipal.getBtnHome().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home2.png")));
            ventanaPrincipal.getColor().setBackground(colores.getGris1());
            booBtnInicio = false;

            ventanaPrincipal.getBtnBar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bar2.png")));
            ventanaPrincipal.getColor1().setBackground(colores.getGris1());
            booBtnBar = false;
            
            ventanaPrincipal.getBtnHistory().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/history1.png")));
            ventanaPrincipal.getColor2().setBackground(colores.getColorPrymary2());
            booBtnHistory = true;
            
            ventanaPrincipal.getBtnFile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/file2.png")));
            ventanaPrincipal.getColor3().setBackground(colores.getGris1());
            booBtnFile = false;
        }
         
         
          if (e.getSource() == ventanaPrincipal.getBtnFile()) {

            ventanaPrincipal.getBtnHome().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home2.png")));
            ventanaPrincipal.getColor().setBackground(colores.getGris1());
            booBtnInicio = false;

            ventanaPrincipal.getBtnBar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bar2.png")));
            ventanaPrincipal.getColor1().setBackground(colores.getGris1());
            booBtnBar = false;
            
            ventanaPrincipal.getBtnHistory().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/history2.png")));
            ventanaPrincipal.getColor2().setBackground(colores.getGris1());
            booBtnHistory = false;
            
            ventanaPrincipal.getBtnFile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/file1.png")));
            ventanaPrincipal.getColor3().setBackground(colores.getColorPrymary2());
            booBtnFile = true;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
