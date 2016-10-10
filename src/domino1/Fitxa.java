/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;
public class Fitxa {
    int Valor1;
    int Valor2;
    private int[] Fitxa = new int [2];
   
    public Fitxa (int Valor1, int Valor2){
        this.Valor1=Valor1;
        this.Valor2=Valor2;
    }
    
    public int[] getFitxa() {
        return this.Fitxa;
        
    }
    public int[] Invertir (int[] Fitxa){ /*Invertir el orden de los valores de 
        fitxa*/
        int aux = Fitxa [0];
        Fitxa [0]=Fitxa [1];
        Fitxa [1]= aux;
        return Fitxa;
    }
    
}
