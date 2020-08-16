/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Optimizadores;

import clases.Particula;
import clases.Poblacion;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import optdisc.Optimizador;

/**
 *
 * @author brau
 */
public class UMDA extends Optimizador{
    
    private LinkedList<Particula> p;
    private Random rd;

    public UMDA(int iter, int Idividuos, int Dimensiones) {
        super(iter, Idividuos, Dimensiones);
        rd = new Random();
        calcular();
    }

    @Override
    public LinkedList<Particula> getP() {
        return p;
    }

    @Override
    public void calcular() {
    Poblacion poblacion = new Poblacion(this.Idividuos, this.Dimensiones);
    p = poblacion.Nueva();
    for(int i =0;i < iter; i++){
        //System.out.println("----------");
    calcFit();
    Collections.sort(p);
    double [] medias = Medias();
    Generar(medias);
    }
    calcFit();
    Collections.sort(p);
    }
    public double[] Medias(){
       double truncar = Idividuos*0.3;
       double[] medias = new double[Dimensiones];
       for(int j =0; j <Dimensiones; j++){
           double suma =0;
       for(int i =0;i < (int) truncar; i++){
           suma+= p.get(i).getVector()[j];
         }
         medias[j] = suma/(double)truncar;
       }
       return medias;
    }
    public void calcFit(){
        for(int i =0; i < p.size();i++){
            double sum =0;
            for(double bit: p.get(i).getVector()){
                sum+= bit;
            }
            p.get(i).setFitness(sum);
        }
    }
    public void Generar(double[] Medias) {
       for(int j = 0; j< Dimensiones;j++){
           for (int i =0; i< p.size();i++){
               if(rd.nextDouble()> Medias[j]){
                   //System.out.println(Medias[j]);
                   p.get(i).getVector()[j] = 0;
               }else{
                   //System.out.println(Medias[j]);
                   p.get(i).getVector()[j] = 1;
               }
               
           }
          }
       // System.out.println("");
       }
   
}
