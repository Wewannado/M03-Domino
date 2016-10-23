/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domino1.Fitxa;
import domino1.Jugador;
import domino1.Partida;
import domino1.Torn;
import java.util.Scanner;

/**
 *
 * @author Roger G. Coscojuela
 */
public class Juego {

    private static boolean ESQUERRA = false;
    private static boolean DRETA = true;

    public static void main(String[] args) {
        // TODO code application logic here
        Juego programa = new Juego();
        programa.inici();
    }

    public void inici() {
        Partida partida = new Partida(4);
        partida.crearFitxes();
        String[] noms = {"Roger", "Marcos", "Gerard", "Abel"};
        partida.crearJugadors(noms);
        partida.repartirFitxes();
        int[] aux = {6, 6};
        Fitxa test = new Fitxa(aux);
        int jugadorInicial = (partida.buscarFitxa(test));
        while (!partida.comprovarFiPartida()) {
            for (int i = 0; i < partida.getJugadors().length; i++) {
                Jugador[] jugadors = partida.getJugadors();
                System.out.println("Les teves fitxes son:");
                System.out.println(jugadors[i]);
                int valor1 = entrarUnNumero("Quina fitxa vols jugar? Entra el primer valor de la fitxa. -1 per passar torn.", "Has d'entrar un valor numeric");
                if (valor1 != -1) {
                    int valor2 = entrarUnNumero("Quina fitxa vols jugar? Entra el segon valor de la fitxa", "Has d'entrar un valor numeric");
                    int posicio = entrarUnNumero("Inserir a la dreta (0) o a l'esquerra (1)?", "Has d'entrar un valor numeric");
                    int[] aux2 = {valor1, valor2};
                    Fitxa fitxa = new Fitxa(aux2);
                    boolean pos;
                    pos = posicio == 0;
                    partida.tirarFitxa(i, fitxa, pos);
                } else {
                    //passem torn :S
                }

                System.out.println("Tauler actual");
                System.out.println(partida.getTablero());
            }
        }
        System.out.println("Fi del JOC!!!! Ha guanyat el jugador.... NO HO SABEM!!");
    }

    public int entrarUnNumero(String missatje, String misError) {
        int resultat = 0;
        Scanner lector = new Scanner(System.in);
        boolean semafor = false;
        do {
            System.out.println(missatje);
            if (lector.hasNextInt()) {
                resultat = lector.nextInt();
                semafor = true;
            } else {
                System.out.println(misError);
            }
            lector.nextLine();
        } while (!semafor);
        return resultat;
    }
}