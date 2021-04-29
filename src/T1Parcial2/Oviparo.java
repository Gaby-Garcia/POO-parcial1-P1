/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1Parcial2;

/**
 *
 * @author Garcia
 */
public abstract class Oviparo extends Animales{
    protected int canthuevos;

    public Oviparo(int canthuevos, String color, String tamaño) {
        super(color, tamaño);
        this.canthuevos = canthuevos;
    }
 
    
}
