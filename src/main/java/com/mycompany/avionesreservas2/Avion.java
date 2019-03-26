/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avionesreservas2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yesid Avila
 */
public  abstract class Avion  {

    /**
     * Esta variable almacena el codigo unico para cada avion
     */
    private int codigo;

    /**
     * Esta variable almacena la aerolinea del avion
     */
    private String aerolinea;

    /**
     * Esta lista almacena las sillas de avion
     */
    private List<Silla> listaSilla;
    /**
     * Constructor que inicializa las variables para uso
     * @param codigo codigo de avion
     * @param aerolinea nombre de aerolinea
     * @param listaSilla lista de las sillas
     */
    public Avion(int codigo, String aerolinea) {
        this.codigo = codigo;
        this.aerolinea = aerolinea;
       listaSilla = new ArrayList<Silla>();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public List<Silla> getListaSilla() {
        return listaSilla;
    }

    public void setListaSilla(List<Silla> listaSilla) {
        this.listaSilla = listaSilla;
    }

}
