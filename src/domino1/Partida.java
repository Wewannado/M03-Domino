/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;
import java.util.ArrayList;
/**
 *
 * @author IES
 */
public class Partida {

    private int NombreJugadors = 4;
    private int NombreFitxes = 28;
    private ArrayList<Fitxa> fitxes;

    public Partida(int NombreJugadors) {
        this.NombreJugadors = NombreJugadors;
        fitxes = new ArrayList<>();
    }

    public void crearFitxes() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                int [] aux = {i,j};
            fitxes.add(new Fitxa(aux));
            }
        }

    }

    public ArrayList<Fitxa> getFitxes() {
        return fitxes;
    }

}
