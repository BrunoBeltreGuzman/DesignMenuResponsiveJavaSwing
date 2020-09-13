/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Eventos.Eventos;
import Ventana.Ventana;

/**
 *
 * @author diosl
 */
public class App {
    
    private static void iniciar(){
        Ventana ventana = new Ventana();
        Eventos eventos = new Eventos(ventana);
        ventana.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        iniciar();
    }
    
}
