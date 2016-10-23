/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author MarcosPortatil
 */
public class Torn {

    private String nom;
    private int TornsPassats;
    private ArrayDeque<Fitxa> fitxes;

    public Torn(String nom, int TornsPassats) {
        this.TornsPassats = TornsPassats;
        this.nom = nom;
        fitxes = new ArrayDeque<>();
    }

    private void passarTorn() {
        TornsPassats++;
    }

    public int getTornsPassats() {
        return TornsPassats;
    }

    void tirarFitxa(String Jugador, Fitxa fitxa) {
           
    }

}
