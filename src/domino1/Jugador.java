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
    private int id;
    private String nom;
    private ArrayList<Fitxa> fitxes;
    
    public Jugador (int id, String nom) {
        this.id=id;
        this.nom=nom;
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

  

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void esborrarFitxa(Fitxa c) {
    fitxes.remove(c);
}

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nom=" + nom + ", fitxes=" + fitxes + '}';
    }
   
}
