/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

import java.util.ArrayList;
import java.util.Random;
import domino1.Jugador;

/**
 *
 * @author IES
 */
public class Partida {

    private int NombreJugadors = 4;
    private int NombreFitxes = 28;
    private ArrayList<Fitxa> fitxes;
    private Jugador [] jugadors;
    

    public Partida(int NombreJugadors) {
        this.NombreJugadors = NombreJugadors;
        fitxes = new ArrayList<>();
    }

    public void crearFitxes() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                int[] aux = {i, j};
                fitxes.add(new Fitxa(aux));
            }
        }

    }

    public void crearJugador(String nombre) {
        jugadors = new Jugador [4];
        for (int i = 1; i < NombreJugadors; i++) {
            
            jugadors[i] = new Jugador(i, nombre);
                
            }
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
         for (int i = 1; i < NombreJugadors; i++) {
             for (int j = 0; j < 7; j++) {
                 jugadors[i].getFitxes().add(this.fitxes[aleatoris]);
                 //jugadors[i].getFitxes().add(this.fitxes[aleatoris[pos++]]);
             }
                
            }
        }
        
    

    public ArrayList<Fitxa> getFitxes() {
        return fitxes;
    }

}
