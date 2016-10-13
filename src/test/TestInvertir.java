/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domino1.Fitxa;
import domino1.Partida;

/**
 *
 * @author MarcosPortatil
 */
public class TestInvertir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partida partida = new Partida(4);
        partida.crearFitxes();
        /**
         * Prueba del metodo Invertir que le pasamos I (Poisicon de la ficha en
         * el array y nos invierte la ficha
         */
        int i = 5;
        partida.getFitxes().get(i).invertir();
        System.out.println(partida.getFitxes().get(i));
        System.out.println("TODAS LAS FICHAS----------------");
        System.out.println(partida.getFitxes());
    }

}
