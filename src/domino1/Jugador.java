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
    
    private String nom;
    private ArrayList<Fitxa> fitxes;
    
    public Jugador (String nom) {
        
        this.nom=nom;
        fitxes= new ArrayList();
    }

   

    public ArrayList<Fitxa> getFitxes() {
        return fitxes;
    }


    public void setFitxes(ArrayList<Fitxa> fitxes) {
        this.fitxes = fitxes;
    }

  

    public String getNom() {
        return nom;
    }    
    public void esborrarFitxa(Fitxa c) {
    fitxes.remove(c);
}

    @Override
    public String toString() {
        return "Jugador{nom=" + nom + ", fitxes=" + fitxes + '}';
    }
   
}
