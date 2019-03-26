/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avionesreservas2;

import java.util.ArrayList;
import java.util.List;

/**
 *@version 1
 * @author Alexander Martinez
 * Esta clase contiene las reservas realizadas por cada pasajero.
 */
public class Reserva {
    /*
    Esta variable almacena la cedula de loasjero que realizo la reserva.
    */
     private int cedulapasajero;
     /*
    Esta variable almacena el codigo del avion.
    */
     private int codigoAvion;
     /*
     Esta variable almacena el costo de la reserva;
     */
    private int costoTotal;
    /*
    Esta lista almecena las sillas que reservo cada pasajero;
    */
     private List<Silla> listaSilla;
   
   /**
    * Este es el constructor que inicializa las variables de la clase.
    * @param cedulapasajero
     * @param codigoAvion
    * @param costoTotal
    * @param listaSilla 
    */ 
    public Reserva(int cedulapasajero,int codigoAvion, int costoTotal,List<Silla> listaSilla) {
        this.cedulapasajero = cedulapasajero;
        this.codigoAvion= codigoAvion;
        this.costoTotal = costoTotal;
        this.listaSilla = listaSilla;
        
    }

    public int getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(int codigoAvion) {
        this.codigoAvion = codigoAvion;
    }
    
    public int getCedulapasajero() {
        return cedulapasajero;
    }

    public void setCedulapasajero(int cedulapasajero) {
        this.cedulapasajero = cedulapasajero;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public List<Silla> getListaSilla() {
        return listaSilla;
    }

    public void setListaSilla(List<Silla> listaSilla) {
        this.listaSilla = listaSilla;
    }
     
    
     
}

