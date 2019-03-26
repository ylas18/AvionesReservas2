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
 * @author Alexander Martinez
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        Inicio ini = new Inicio();
        List<Avion> ListaAvion;
       ListaAvion = ini.traerAvion();
        ini.imprimirAvion(ListaAvion);
        ini.reservar(ListaAvion);

    }

}
