/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avionesreservas2;

import java.util.ArrayList;
import java.util.Date;

/**
 *@version 1
 * @author Alexander Martinez
 * Esta clase almacen los datos del pasajero que realizara la reserva.
 */
public class Pasajero {
    /*
    Esta variable almacena la cedula del pasajero.
    */
    private int cedula;
    /*
    Esta variable almacena el nombre del pasajero.
    */
    private String nombre;
    /*
    Esta variable almacena la fecha de nacimineo del pasajero.
    */
    private Date fechaNacimiento;
    /*
    esta lista almecena las reservas realizadas por cada pasajero.
    */
    private ArrayList<Reserva> listaReserva;
    /**
     * Este es el constructor que inicializa las variables de esta clase para su uso.
     * @param cedula
     * @param nombre
     * @param fechaNacimiento 
     */
    public Pasajero(int cedula, String nombre, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        listaReserva = new ArrayList<Reserva>();
    }

    public ArrayList<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(ArrayList<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }
    /*
    este metodo obtiene la cedula.
    */
    public int getCedula() {
        return cedula;
    }
    /*
    este metodo modifica la cedula.
    */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    /*
    este metodo obtiene el nombre del pasajero.
    */
    public String getNombre() {
        return nombre;
    }
    /*
    este metodo obtiene el nombre del pasajero.
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
    Este metodo obtiene la fecha de nacimiento del pasajero.
    */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    /*
    Este metodo modifica la fecha de nacimiento del pasajero.
    */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
}
