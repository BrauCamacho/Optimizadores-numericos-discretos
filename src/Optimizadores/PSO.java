/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Optimizadores;

import clases.Particula;
import clases.Poblacion;
import java.util.Collections;
import java.util.LinkedList;
import optdisc.Optimizador;

/**
 *
 * @author brau
 */
public class PSO extends Optimizador {

    private LinkedList<Particula> p;
    double fi = 4.1;
    double fi1 = 2.05;
    double fi2 = 2.05;
    double X = 2 / (fi - 2 + Math.sqrt(Math.pow(fi, 2) - 4 * fi));

    public PSO(int iter, int Idividuos, int Dimensiones) {
        super(iter, Idividuos, Dimensiones);
    }

    @Override
    public void calcular() {
        Poblacion poblacion = new Poblacion(this.Idividuos, this.Dimensiones);
        p = poblacion.Nueva();
        //calcFit();
        Collections.sort(p);
        Particula Gbest = p.get(0);
        LinkedList<Particula> Pbest = p;
        for(int i =0;i < iter;i++){
            
        }
        
    }

    @Override
    public LinkedList<Particula> getP() {
        return p;
    }

//    public void calcFit() {
//        for (int i = 0; i < p.size(); i++) {
//            p.get(i).setFitness(funcion.calcular(p.get(i).getVector()));
//        }
//    }
}
