/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

public class Fitxa {

    private int[] Valor;

    public Fitxa(int[] Valor) {
        this.Valor = Valor;
    }

    public int[] getValor() {
        return Valor;
    }

    public void invertir() { /*Invertir el orden de los valores de 
         fitxa*/

        int aux = Valor[0];
        Valor[0] = Valor[1];
        Valor[1] = aux;
    }

    @Override
    public String toString() {
        
        return "\n "+ "Fitxa{" + "Valor=" + Valor[0] + "," + Valor[1]+"}";
    }
    
}
