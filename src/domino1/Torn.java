/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

/**
 *
 * @author MarcosPortatil
 */
public class Torn {

    private String nom;
    private int TornsPassats;

    public Torn(String nom, int TornsPassats) {
        this.TornsPassats = TornsPassats;
        this.nom = nom;
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
