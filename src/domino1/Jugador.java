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
    String nonbre;
    private ArrayList<Fitxa> fitxes;
    
    public Jugador (int id, String nombre) {
        this.id=id;
        this.nonbre=nombre;
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

    public String getNonbre() {
        return nonbre;
    }

    public void setNonbre(String nonbre) {
        this.nonbre = nonbre;
    }
    
    public void esborrarFitxa(Fitxa c) {
    fitxes.remove(c);
}
   
}
