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
        partida.tirarFitxa(jugadorInicial, test);
        Jugador[] jugadors = partida.getJugadors();
        System.out.println("La fitxa [" + aux[0] + ":" + aux[1] + "] es de: " + jugadors[jugadorInicial].getNom());
        jugadorInicial++;
        while (!partida.comprovarFiPartida()) {
            for (int i = jugadorInicial; i < partida.getJugadors().length; i++) {
                System.out.println("Tauler actual");
                System.out.println(partida.getTablero());
                boolean semaforo = false;
                do {

                    System.out.println("Les teves fitxes son:");
                    System.out.println(jugadors[i]);
                    int valor1 = entrarUnNumero("Quina fitxa vols jugar? Entra el primer valor de la fitxa. -1 per passar torn.", "Has d'entrar un valor numeric");
                    if (valor1 != -1) {
                        int valor2 = entrarUnNumero("Quina fitxa vols jugar? Entra el segon valor de la fitxa", "Has d'entrar un valor numeric");
                        boolean pos = partida.yesNo("Inserir a la dreta (0) o a l'esquerra (1)?", "Has d'entrar un valor numeric");
                        int[] aux2 = {valor1, valor2};
                        Fitxa fitxa = new Fitxa(aux2);
                        semaforo = partida.tirarFitxa(i, fitxa, pos);
                        if (!semaforo) {
                            System.out.println("No es pot jugar aquesta fitxa");
                            System.out.println("Tauler actual");
                            System.out.println(partida.getTablero());
                        }
                    } else {
                        //el jugador passa turno.
                        semaforo = true;
                    }
                } while (!semaforo);
            }
            jugadorInicial = 0;
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
