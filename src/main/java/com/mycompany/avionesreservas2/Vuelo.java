/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avionesreservas2;

import java.util.ArrayList;

/**
 *@version 1
 * @author Alexander Martinez
 * Esta clase contiene una lista de los aviones y determina cual es el valor con el que despega cada avion.
 */
public class Vuelo {
    /*
    esta lista contiene todos los aviones disponibles para vuelo.
    */
    private ArrayList<Avion> listaAvion;
    /*
    esta variable almacena el dinero total con el que despega cada avion.
    */
    private int total;
    /**
     * Este es el constructor que inicializa las variables de esta clase para su uso.
     * @param listaAvion
     * @param total 
     */
    public Vuelo(ArrayList<Avion> listaAvion, int total) {
        this.listaAvion = listaAvion;
        this.total = total;
    }

    public ArrayList<Avion> getListaAvion() {
        return listaAvion;
    }

    public void setListaAvion(ArrayList<Avion> listaAvion) {
        this.listaAvion = listaAvion;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
