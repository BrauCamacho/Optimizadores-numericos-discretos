/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optdisc;

import Optimizadores.UMDA;
import clases.Particula;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author brau
 */
public class OptDisc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] mejores = new double[1];
        OptDisc opt = new OptDisc();
        int Individuos = 100;
        int Dimensiones = 1000;
        int ciclos = opt.ciclos(Individuos, Dimensiones);
        for(int i =0;i< 1;i++){
        Optimizador op = new UMDA(ciclos, Individuos, Dimensiones);
        LinkedList<Particula> resul = op.getP();
        mejores[i] = resul.get(0).getFitness();
        }
        Arrays.sort(mejores);
        double media = opt.media(mejores);
        double varianza = opt.varianza(mejores, media);
        System.out.println("Media: "+media);
        System.out.println("Varianza : "+varianza);
        System.out.println("Minimo: "+mejores[0]);
        System.out.println("Maximo: "+mejores[mejores.length-1]);
    }
    public double media(double[] mejores){
        double res =0;
        for(double d: mejores){
            res+= d;
        }
        return res/(double)mejores.length;
    }
    public double varianza(double[] mejores, double media){
        double res =0;
        for(double d: mejores){
            res+= Math.pow(d- media,2);
        }
        return res/(double)mejores.length;
    }
    public int ciclos(int m, int d) {
        return (d * 1000) / m;
    }
}
