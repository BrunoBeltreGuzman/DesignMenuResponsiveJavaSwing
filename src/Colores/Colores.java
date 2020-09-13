/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import java.awt.Color;
import org.w3c.dom.css.RGBColor;

/**
 *
 * @author diosl
 */
public class Colores {

    private Color fondo1;
    private Color fondo2;
    private Color fondo3;
    
    
    private Color gris1;
    private Color gris2;
    private Color gris3;
    
    private Color colorPrymary;
    private Color colorPrymary2;
    private Color colorPrymary3;
    
    private Color[] colorBar;
    private Color[] colorCheck;
    
    private Color colorBar1;
    private Color colorBar2;
    private Color colorBar3;
    private Color colorBar4;
    private Color colorBar5;
    private Color colorBar6;
    private Color colorBar7;
    private Color colorBar8;
    private Color colorBar9;
    private Color colorBar10;
    

    private Color colorBackground;
    private Color colorForeground;

    private Color colorFaceBook;
    private Color colorGoogle;
    private Color colorApple;
    private Color colorMicrosoft;

    public Colores() {
        
        fondo1 = new Color(35, 44, 78);
        fondo2 = new Color(37, 46, 81);
        fondo3 = new Color(40, 50, 88);
        
        gris1 = new Color(235,235,235);
        gris2 = new Color(78, 79, 80);
        gris3 = new Color(99, 101, 103);
        
        colorPrymary = new Color(4, 109, 228);
        colorPrymary2 = new Color(7, 121, 233);
        colorPrymary3 = new Color(15, 145, 243);
        
        colorBackground = new Color(24, 25, 26);
        colorForeground = new Color(255, 255, 255);

        colorFaceBook = new Color(23, 115, 234);;
        colorGoogle = new Color(247, 63, 47);
        colorApple = new Color(0, 0, 0);
        colorMicrosoft = new Color(110, 182, 28);
        
        colorBar = new Color[10];
        
        setColorBar();
        
        colorCheck = new Color[10];
        setColorBar2();
    }
    
    
    
    private  void setColorBar(){
        int inc = 100;
        for (int i = 0; i < 10; i++) {
            inc = inc - 10;
            Color colo = new Color(109 - inc, 220 - inc, 255 - inc);
            colorBar[i] = colo;
            
        }
    }
    
    private  void setColorBar2(){
        int inc = 50;
        for (int i = 0; i < 10; i++) {
            inc = inc - 5;
            Color colo = new Color(251 - inc, 83 - inc, 112 - inc);
            colorCheck[i] = colo;
            
        }
    }

    public Color getColorBar(int index) {
        return colorBar[index];
    }

    public Color getColorCheck(int index) {
        return colorCheck[index];
    }
    
    
    public Color getFondo2() {
        return fondo2;
    }

    public Color getFondo3() {
        return fondo3;
    }

    
    
    public Color getFondo1() {
        return fondo1;
    }

    public Color getGris1() {
        return gris1;
    }

    public Color getGris2() {
        return gris2;
    }

    public Color getGris3() {
        return gris3;
    }

    public Color getColorPrymary() {
        return colorPrymary;
    }

    public Color getColorPrymary2() {
        return colorPrymary2;
    }

    public Color getColorBackground() {
        return colorBackground;
    }

    public Color getColorForeground() {
        return colorForeground;
    }

    Color borderVerde = new Color(0, 127, 0);

    public Color getBorderVerde() {
        return borderVerde;
    }

    Color borderAzul = new Color(0, 126, 255);

    public Color getBorderAzul() {
        return borderAzul;
    }

    Color borderRojo = new Color(255, 0, 0);

    public Color getBorderRojo() {
        return borderRojo;
    }

    public Color getColorFaceBook() {
        return colorFaceBook;
    }

    public Color getColorGoogle() {
        return colorGoogle;
    }

    public Color getColorApple() {
        return colorApple;
    }

    public Color getColorMicrosoft() {
        return colorMicrosoft;
    }
    
    
    

}
