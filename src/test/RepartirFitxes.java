/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domino1.Partida;
import domino1.Jugador;

/**
 *
 * @author MarcosPortatil
 */
public class RepartirFitxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Partida partida = new Partida(4);
        partida.crearFitxes();
        
       
        String [] noms = {"Roger","Marcos","Gerard","Abel"};
        partida.crearJugadors(noms);
        
        partida.repartirFitxes();
        for (Jugador j: partida.getJugadors()) {
            System.out.println(j);
        }
        System.out.println(partida.buscarFitxa(0));
       
        
        
    }
    
}
