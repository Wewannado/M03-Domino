/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

import java.util.ArrayList;

/**
 *
 * @author MarcosPortatil
 */
public class Jugador {
    int id;
    private ArrayList<Fitxa> fitxes;
    
    public Jugador (int id) {
        this.id=id;
        fitxes= new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Fitxa> getFitxes() {
        return fitxes;
    }

    public void setFitxes(ArrayList<Fitxa> fitxes) {
        this.fitxes = fitxes;
    }
    
    public void esborrarCita(Fitxa c) {
    fitxes.remove(c);
}
   
}
