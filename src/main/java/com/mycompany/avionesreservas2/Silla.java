/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avionesreservas2;

/**
 *
 * @author Yesid Avila
 */
public class Silla {

    /**
     * Varialbe que almacena el codigo unico de cada silla del avion
     */
    private int codigo;

    /**
     * Variable que almacena el precio de cada silla del avion
     */
    private int precio;

    /**
     * Variable que almacena la fila donde se encuetra ubicada cada silla
     */
    private char fila;

    /**
     * Variable que almacena la columna donde se encuentra ubicada la silla
     */
    private int columna;

    /**
     * Variable que almacena el estado en el que se enuentra la silla si esta
     * vendida o disponible
     */
    private boolean estado;
    /**
     * Constructor que inicializa las variables para usar la clase
     * @param codigo codigo de silla
     * @param precio precio de silla
     * @param fila fila de la silla
     * @param columna columna de la silla
     * @param estado estado de la silla
     */
    public Silla(int codigo, int precio, char fila, int columna, boolean estado) {
        this.codigo = codigo;
        this.precio = precio;
        this.fila = fila;
        this.columna = columna;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
