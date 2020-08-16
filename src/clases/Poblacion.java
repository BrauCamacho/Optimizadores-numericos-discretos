/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.LinkedList;
import java.util.Random;


/**
 *
 * @author brau
 */
public class Poblacion {
    private int P;
    private int D;
   

    public Poblacion(int P, int D) {
        this.P = P;
        this.D = D;
        
    }
    public LinkedList<Particula> Nueva(){
        LinkedList<Particula> p = new LinkedList<>();
         Random rd = new Random();
         for(int i =0; i < P;i++){
             double[] vector = new double[D];
             for(int j =0;j< D;j++){
                 vector[j] = rd.nextInt(2);
             }
             p.add(new Particula(vector));
         }
         return p;
    }
}
