/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optdisc;

import clases.Particula;
import java.util.LinkedList;

/**
 *
 * @author brau
 */
public abstract class Optimizador {
    protected int Idividuos;
    protected int Dimensiones;
    protected int iter;
    public abstract void calcular();
    public abstract LinkedList<Particula> getP();
    public Optimizador(int iter,int Idividuos, int Dimensiones) {
        this.iter = iter;
        this.Idividuos = Idividuos;
        this.Dimensiones = Dimensiones;
    }

}
