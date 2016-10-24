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
import java.util.Scanner;

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
            for (int j = 0; j < 7; j++) {
                jugadors[i].getFitxes().add(this.fitxes.get(aleatoris[pos++]));
            }

        }
    }

    /**
     *
     * @param jugador
     * @param fitxa
     * @param posicio valor FALSE (0) inserta a la derecha, valor true (1) a la
     * izquierda
     */
    public boolean tirarFitxa(int jugador, Fitxa fitxa, boolean posicio) {
        if (comprovarPosibilitatIntroduccio(fitxa, posicio)) {
            if (posicio) {
                System.out.println("Check 7 - pos val "+posicio + "la ficha es" +fitxa.toString());
                tablero.add(comprovarPosicioFitxa(fitxa, posicio));
                System.out.println("Check 5 - pos val "+posicio + "la ficha es" +fitxa.toString());
            } else {
                System.out.println("Check 8 - pos val "+posicio + "la ficha es" +fitxa.toString());
                tablero.addFirst(comprovarPosicioFitxa(fitxa, posicio));
                System.out.println("Check 6 - pos val "+posicio + "la ficha es" +fitxa.toString());
            }
        } else {
            return false;
        }
        jugadors[jugador].esborrarFitxa(fitxa);
        return true;
    }

    public void tirarFitxa(int jugador, Fitxa fitxa) {

        tablero.add(fitxa);
    }

    public void tirarFitxa(int jugador, Fitxa fitxa, boolean posicio, Fitxa fitxa2, boolean posicio2) {
        jugadors[jugador].esborrarFitxa(fitxa);
        jugadors[jugador].esborrarFitxa(fitxa2);
        if (posicio) {
            tablero.add(comprovarPosicioFitxa(fitxa, posicio));
        } else {
            tablero.addFirst(comprovarPosicioFitxa(fitxa, posicio));
        }
        if (posicio2) {
            tablero.add(comprovarPosicioFitxa(fitxa, posicio2));
        } else {
            tablero.addFirst(comprovarPosicioFitxa(fitxa, posicio2));
        }
    }

    public boolean comprovarFiPartida() {
        for (int i = 0; i < NombreJugadors; i++) {
            if (jugadors[i].getFitxes().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private Fitxa comprovarPosicioFitxa(Fitxa fitxa, boolean posicio) {
        if (posicio) {
            if (fitxa.getValor()[0] != tablero.getLast().getValor()[1]) {
                System.out.println("Check 1 - pos val "+posicio + "la ficha es" +fitxa.toString());
                fitxa.invertir();
            }
        } else if (fitxa.getValor()[1] != tablero.getFirst().getValor()[0]) {
            System.out.println("Check 2 - pos val "+posicio + "la ficha es" +fitxa.toString());
            fitxa.invertir();
        }
        return fitxa;
    }

    private boolean comprovarPosibilitatIntroduccio(Fitxa fitxa, boolean posicio) {
        boolean correcte = false;
        if (posicio) {
            if (fitxa.getValor()[0] == tablero.getLast().getValor()[1] || fitxa.getValor()[1] == tablero.getLast().getValor()[1]) {
                System.out.println("Check 3 - pos val "+posicio + "la ficha es" +fitxa.toString());
                return true;
            }
        } else if (fitxa.getValor()[1] == tablero.getFirst().getValor()[0] || fitxa.getValor()[0] == tablero.getFirst().getValor()[0]) {
            System.out.println("Check 4 - pos val "+posicio + "la ficha es" +fitxa.toString());
            return true;
        }
        return correcte;
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

    public boolean yesNo(String missatje, String misError) {
        int result = 0;
        boolean resultat = false;
        Scanner lector = new Scanner(System.in);
        boolean semafor = false;
        do {
            System.out.println(missatje);
            if (lector.hasNextInt()) {
                result = lector.nextInt();
                switch (result) {
                    case 0:
                        resultat = true;
                        semafor = true;
                        break;
                    case 1:
                        resultat = false;
                        semafor = true;
                        break;
                    default:
                        semafor = false;
                }
            } else {
                System.out.println(misError);
            }
            lector.nextLine();
        } while (!semafor);
        return resultat;
    }

}
