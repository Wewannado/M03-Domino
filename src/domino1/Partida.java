/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

import java.util.ArrayList;
import java.util.Random;
import domino1.Jugador;
import java.util.ArrayDeque;
import java.util.Arrays;

/**
 *
 * @author IES
 */
public class Partida {

    private int NombreJugadors = 4;
    private int NombreFitxes = 28;
    private ArrayList<Fitxa> fitxes;
    private Jugador[] jugadors;
    private ArrayDeque<Fitxa> tablero;

    public Partida(int NombreJugadors) {
        this.NombreJugadors = NombreJugadors;
        fitxes = new ArrayList<>();
        tablero = new ArrayDeque<>();
    }

    public void crearFitxes() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                int[] aux = {i, j};
                fitxes.add(new Fitxa(aux));
            }
        }

    }

    public void crearJugadors(String[] nom) {
        jugadors = new Jugador[4];
        for (int i = 0; i < NombreJugadors; i++) {

            jugadors[i] = new Jugador(nom[i]);

        }
    }

    public int buscarFitxa(Fitxa fitxa) {
        int jugador = 0;
        for (int i = 0; i < NombreJugadors; i++) {
            ArrayList<Fitxa> aux = new ArrayList();
            aux = jugadors[i].getFitxes();
            for (int j = 0; j < aux.size(); j++) {
                if (Arrays.equals(aux.get(j).getValor(), fitxa.getValor())) {
                    jugador = i;
                }
            }
        }
        return jugador;
    }

    public int[] arrayDesordenat() {
        int[] aleatoris = new int[NombreFitxes];
        boolean[] aux = new boolean[NombreFitxes];
        int num;
        Random rand = new Random();
        for (int i = 0; i < NombreFitxes;) {
            num = rand.nextInt(NombreFitxes);
            if (!aux[num]) {
                aleatoris[i] = num;
                aux[num] = true;
                i++;
            }
        }
        return aleatoris;
    }

    public void repartirFitxes() {

        int[] aleatoris = arrayDesordenat();
        int pos = 0;
        for (int i = 0; i < NombreJugadors; i++) {
//             ArrayList<Fitxa> aux= new ArrayList();
            for (int j = 0; j < 7; j++) {
//                 aux.add(this.fitxes.get(aleatoris[j]));

                jugadors[i].getFitxes().add(this.fitxes.get(aleatoris[pos++]));
            }
//              System.out.println(aux);  
            // jugadors[1].setFitxes(aux);
            //}

        }
    }

    /**
     *
     * @param jugador
     * @param fitxa
     * @param posicio valor FALSE inserta a izquierda, valor true a la derecha
     */
    public void tirarFitxa(int jugador, Fitxa fitxa, boolean posicio) {
        jugadors[jugador].esborrarFitxa(fitxa);
        if (posicio) {
            tablero.add(fitxa);
        } else {
            tablero.addFirst(fitxa);
        }
    }

    public void tirarFitxa(int jugador, Fitxa fitxa, boolean posicio, Fitxa fitxa2, boolean posicio2) {
        jugadors[jugador].esborrarFitxa(fitxa);
        jugadors[jugador].esborrarFitxa(fitxa2);
        if (posicio) {
            tablero.add(fitxa);
        } else {
            tablero.addFirst(fitxa);
        }
        if (posicio2) {
            tablero.add(fitxa2);
        } else {
            tablero.addFirst(fitxa2);
        }
    }

    public ArrayList<Fitxa> getFitxes() {
        return fitxes;
    }

    public ArrayDeque<Fitxa> getTablero() {
        return tablero;
    }

    public Jugador[] getJugadors() {
        return jugadors;
    }

}
