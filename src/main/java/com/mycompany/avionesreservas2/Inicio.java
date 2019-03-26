/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avionesreservas2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexander Martinez
 */
public class Inicio {

    ArrayList<Avion> listaAvion = new ArrayList<Avion>();

    public ArrayList<Avion> traerAvion() {

        Silla VIP1 = new Silla(1, 250, 'A', 1, true);
        Silla VIP2 = new Silla(2, 250, 'A', 2, true);
        Silla VIP3 = new Silla(3, 250, 'A', 3, true);
        Silla VIP4 = new Silla(4, 250, 'B', 1, true);
        Silla VIP5 = new Silla(5, 250, 'B', 2, true);
        Silla VIP6 = new Silla(6, 250, 'B', 3, true);
        Silla VIP7 = new Silla(7, 250, 'C', 1, true);
        Silla VIP8 = new Silla(8, 250, 'C', 2, true);
        Silla VIP9 = new Silla(9, 250, 'C', 3, true);
        Silla VIP10 = new Silla(10, 250, 'D', 1, true);
        Silla VIP11 = new Silla(11, 250, 'D', 2, true);
        Silla VIP12 = new Silla(12, 250, 'D', 3, true);
        Silla VIP13 = new Silla(13, 250, 'E', 1, true);
        Silla VIP14 = new Silla(14, 250, 'E', 2, true);
        Silla VIP15 = new Silla(15, 250, 'E', 3, true);

        Silla comercial1 = new Silla(1, 150, 'A', 1, true);
        Silla comercial2 = new Silla(2, 150, 'A', 2, true);
        Silla comercial3 = new Silla(3, 150, 'A', 3, true);
        Silla comercial4 = new Silla(4, 150, 'B', 1, true);
        Silla comercial5 = new Silla(5, 150, 'B', 2, true);
        Silla comercial6 = new Silla(6, 150, 'B', 3, true);
        Silla comercial7 = new Silla(7, 150, 'C', 1, true);
        Silla comercial8 = new Silla(8, 150, 'C', 2, true);
        Silla comercial9 = new Silla(9, 150, 'C', 3, true);
        Silla comercial10 = new Silla(10, 150, 'D', 1, true);
        Silla comercial11 = new Silla(11, 150, 'D', 2, true);
        Silla comercial12 = new Silla(12, 150, 'D', 3, true);
        Silla comercial13 = new Silla(13, 150, 'E', 1, true);
        Silla comercial14 = new Silla(14, 150, 'E', 2, true);
        Silla comercial15 = new Silla(15, 150, 'E', 3, true);

        Silla Mix1 = new Silla(1, 150, 'A', 1, true);
        Silla Mix2 = new Silla(2, 150, 'A', 2, true);
        Silla Mix3 = new Silla(3, 150, 'A', 3, true);
        Silla Mix4 = new Silla(4, 150, 'B', 1, true);
        Silla Mix5 = new Silla(5, 150, 'B', 2, true);
        Silla Mix6 = new Silla(6, 150, 'B', 3, true);
        Silla Mix7 = new Silla(7, 250, 'C', 1, true);
        Silla Mix8 = new Silla(8, 250, 'C', 2, true);
        Silla Mix9 = new Silla(9, 250, 'C', 3, true);
        Silla Mix10 = new Silla(10, 250, 'D', 1, true);
        Silla Mix11 = new Silla(11, 250, 'D', 2, true);
        Silla Mix12 = new Silla(12, 250, 'D', 3, true);
        Silla Mix13 = new Silla(13, 250, 'E', 1, true);
        Silla Mix14 = new Silla(14, 250, 'E', 2, true);
        Silla Mix15 = new Silla(15, 250, 'E', 3, true);

        AvionVIP avionVIP = new AvionVIP(1, "Avianca");
        AvionStandar avionComercial = new AvionStandar(2, "VivaColombia");
        AvionMix avionMix = new AvionMix(3, "LATAM");

        avionComercial.getListaSilla().add(comercial1);
        avionComercial.getListaSilla().add(comercial2);
        avionComercial.getListaSilla().add(comercial3);
        avionComercial.getListaSilla().add(comercial4);
        avionComercial.getListaSilla().add(comercial5);
        avionComercial.getListaSilla().add(comercial6);
        avionComercial.getListaSilla().add(comercial7);
        avionComercial.getListaSilla().add(comercial8);
        avionComercial.getListaSilla().add(comercial9);
        avionComercial.getListaSilla().add(comercial10);
        avionComercial.getListaSilla().add(comercial11);
        avionComercial.getListaSilla().add(comercial12);
        avionComercial.getListaSilla().add(comercial13);
        avionComercial.getListaSilla().add(comercial14);
        avionComercial.getListaSilla().add(comercial15);
        
        avionVIP.getListaSilla().add(VIP1);
        avionVIP.getListaSilla().add(VIP2);
        avionVIP.getListaSilla().add(VIP3);
        avionVIP.getListaSilla().add(VIP4);
        avionVIP.getListaSilla().add(VIP5);
        avionVIP.getListaSilla().add(VIP6);
        avionVIP.getListaSilla().add(VIP7);
        avionVIP.getListaSilla().add(VIP8);
        avionVIP.getListaSilla().add(VIP9);
        avionVIP.getListaSilla().add(VIP10);
        avionVIP.getListaSilla().add(VIP11);
        avionVIP.getListaSilla().add(VIP12);
        avionVIP.getListaSilla().add(VIP13);
        avionVIP.getListaSilla().add(VIP14);
        avionVIP.getListaSilla().add(VIP15);

        avionMix.getListaSilla().add(Mix1);
        avionMix.getListaSilla().add(Mix2);
        avionMix.getListaSilla().add(Mix5);
        avionMix.getListaSilla().add(Mix6);
        avionMix.getListaSilla().add(Mix7);
        avionMix.getListaSilla().add(Mix8);
        avionMix.getListaSilla().add(Mix9);
        avionMix.getListaSilla().add(Mix10);
        avionMix.getListaSilla().add(Mix11);
        avionMix.getListaSilla().add(Mix12);
        avionMix.getListaSilla().add(Mix13);
        avionMix.getListaSilla().add(Mix14);
        avionMix.getListaSilla().add(Mix15);

        listaAvion.add(avionVIP);
        listaAvion.add(avionComercial);
        listaAvion.add(avionMix);

        return listaAvion;
    }

    public void imprimirAvion(List<Avion> list) {
        List<Avion> listaAvion = new ArrayList<>();
        listaAvion = list;
        System.out.println("Lista de Aviones.");
        for (Avion listaAviones : listaAvion) {
            if (listaAviones instanceof AvionStandar) {
                AvionStandar x;
                x = ((AvionStandar) listaAviones);
                System.out.println("\033[31mAvion Standar");
                System.out.println("\033[36m      ~     ");
                System.out.println("\033[36m************");
                System.out.println("\033[34m" + x.getAerolinea());
                System.out.println("\033[31m" + x.getCodigo());
                System.out.println("\033[36m**°******°**");
                System.out.println("\033[36m************");

                for (Silla r : x.getListaSilla()) {

                    if (r.isEstado() == false) {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[31m" + r.getFila() + "\033[31m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[32m" + r.getFila() + "\033[32m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");

            } else if (listaAviones instanceof AvionVIP) {
                AvionVIP x;
                x = ((AvionVIP) listaAviones);
                System.out.println("\033[34mAvion VIP");
                System.out.println("\033[36m      ~     ");
                System.out.println("\033[36m************");
                System.out.println("\033[34m" + x.getAerolinea());
                System.out.println("\033[31m" + x.getCodigo());
                System.out.println("\033[36m**°******°**");
                System.out.println("\033[36m************");

                for (Silla r : x.getListaSilla()) {

                    if (r.isEstado() == false) {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[31m" + r.getFila() + "\033[31m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[32m" + r.getFila() + "\033[32m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            } else if (listaAviones instanceof AvionMix) {
                AvionMix x;
                x = ((AvionMix) listaAviones);
                System.out.println("\033[34mAvion Mix");
                System.out.println("\033[36m      ~     ");
                System.out.println("\033[36m************");
                System.out.println("\033[34m" + x.getAerolinea());
                System.out.println("\033[31m" + x.getCodigo());
                System.out.println("\033[36m**°******°**");
                System.out.println("\033[36m************");

                for (Silla r : x.getListaSilla()) {

                    if (r.isEstado() == false) {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[31m" + r.getFila() + "\033[31m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[32m" + r.getFila() + "\033[32m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            }
        }

    }

    public void reservar(List<Avion> list) {

        Scanner entrada = new Scanner(System.in);
        int precio = 0;
        int cedula = 0;
        List<Silla> listaSillaReserva = new ArrayList<Silla>();
        
        List<Silla> listaSilla = null;
        try {
            System.out.print("\033[34mIngrese la cedula de la persona: ");
            cedula = entrada.nextInt();
            entrada.nextLine();
        } catch (InputMismatchException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }

        System.out.print("\033[34mIngrese el nombre de la persona: ");
        String nombre = entrada.nextLine();

        System.out.print("\033[34mIngrese  la fecha de nacimiento(dd/MM/yyyy): ");
        Date fechaN = null;
        try {
            fechaN = new SimpleDateFormat("dd/MM/yyyy").parse(entrada.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        Pasajero pas = new Pasajero(cedula, nombre, fechaN);
        int opc1 = 1;
        int opc2 = 1;

        while (opc1 == 1) {
            System.out.print("\033[34mIngrese el codigo del Avion: ");
            int codigo = entrada.nextInt();
            entrada.nextLine();
            opc2 = 1;
            while (opc2 == 1) {
                System.out.print("\033[34mIngrese la letra de la silla: ");
                char fila = entrada.next().charAt(0);
                System.out.print("\033[34mIngrese el numero de la silla: ");
                int columna = entrada.nextInt();
                System.out.print("\033[32mDigite 1 para ingresar otra silla: ");
                opc2 = entrada.nextInt();
                listaSilla = listaAvion.get(codigo - 1).getListaSilla();
                for (Silla s : listaSilla) {
                    if (s.getColumna() == columna && s.getFila() == fila) {
                        if (s.isEstado() == false) {
                            System.err.println("Esta silla ya se encuentra reservada");

                        } else {
                            s.setEstado(false);

                           
                            Reserva reser = new Reserva(cedula, codigo - 1, precio, listaSillaReserva);
                            listaSillaReserva.add(s);
                            pas.getListaReserva().add(reser);
                            precio = precio + s.getPrecio();
                        }
                    }
                }

            }
            System.out.print("\033[32mDigite 1 para ingresar otra reserva: ");
            opc1 = entrada.nextInt();
        }

        System.out.println("\033[32mDatos de compra.");
        System.out.println("\033[32mNombre Pasajero:" + pas.getNombre());

        for (Silla s : listaSillaReserva) {
            System.out.println("\033[32mSilla: " + s.getFila() + s.getColumna() + "\033[32mprecio: " + s.getPrecio());
        }
        System.out.println("\033[32mPrecio Total: " + precio);

        System.out.println("Lista de Aviones.");
        for (Avion listaAviones : listaAvion) {
            if (listaAviones instanceof AvionStandar) {
                AvionStandar x;
                x = ((AvionStandar) listaAviones);
                System.out.println("\033[31mAvion Standar");
                System.out.println("\033[36m      ~     ");
                System.out.println("\033[36m************");
                System.out.println("\033[34m" + x.getAerolinea());
                System.out.println("\033[36m**°******°**");
                System.out.println("\033[36m************");

                for (Silla r : x.getListaSilla()) {

                    if (r.isEstado() == false) {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[31m" + r.getFila() + "\033[31m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[32m" + r.getFila() + "\033[32m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");

            } else if (listaAviones instanceof AvionVIP) {
                AvionVIP x;
                x = ((AvionVIP) listaAviones);
                System.out.println("\033[34mAvion VIP");
                System.out.println("\033[36m      ~     ");
                System.out.println("\033[36m************");
                System.out.println("\033[34m" + x.getAerolinea());
                System.out.println("\033[36m**°******°**");
                System.out.println("\033[36m************");

                for (Silla r : x.getListaSilla()) {

                    if (r.isEstado() == false) {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[31m" + r.getFila() + "\033[31m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[32m" + r.getFila() + "\033[32m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            } else if (listaAviones instanceof AvionMix) {
                AvionMix x;
                x = ((AvionMix) listaAviones);
                System.out.println("\033[34mAvion Mix");
                System.out.println("\033[36m      ~     ");
                System.out.println("\033[36m************");
                System.out.println("\033[34m" + x.getAerolinea());
                System.out.println("\033[36m**°******°**");
                System.out.println("\033[36m************");

                for (Silla r : x.getListaSilla()) {

                    if (r.isEstado() == false) {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[31m" + r.getFila() + "\033[31m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[32m" + r.getFila() + "\033[32m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            }
        }
    }
    public String reservarPrueba(List<Avion> list, int cedulaCliente, int codigoAvion, int columnaSilla, String nombrePersona, char letraSilla) {

        Scanner entrada = new Scanner(System.in);
        int precio = 0;
        int cedula = 0;
        List<Silla> listaSillaReserva = new ArrayList<Silla>();

        List<Silla> listaSilla = null;

        Date fechaN = null;

        Pasajero pas = new Pasajero(cedula, nombrePersona, fechaN);
        int opc1 = 1;
        int opc2 = 1;
        String sillaPrueba = null;
        while (opc1 == 1) {

            int codigo = codigoAvion;

            opc2 = 1;
            while (opc2 == 1) {

                char fila = letraSilla;

                int columna = columnaSilla;

                opc2 = entrada.nextInt();
                listaSilla = listaAvion.get(codigo - 1).getListaSilla();
                for (Silla s : listaSilla) {
                    if (s.getColumna() == columna && s.getFila() == fila) {
                        if (s.isEstado() == false) {
                            System.err.println("Esta silla ya se encuentra reservada");

                        } else {
                            s.setEstado(false);
                            sillaPrueba = String.valueOf(s.getColumna() + s.getFila());
                            Reserva reser = new Reserva(cedula, codigo - 1, precio, listaSillaReserva);
                            listaSillaReserva.add(s);
                            pas.getListaReserva().add(reser);
                            precio = precio + s.getPrecio();
                        }
                    }
                }

            }
            System.out.print("\033[32mDigite 1 para ingresar otra reserva: ");
            opc1 = entrada.nextInt();
        }

        System.out.println("\033[32mDatos de compra.");
        System.out.println("\033[32mNombre Pasajero:" + pas.getNombre());

        for (Silla s : listaSillaReserva) {
            System.out.println("\033[32mSilla: " + s.getFila() + s.getColumna() + "\033[32mprecio: " + s.getPrecio());
        }
        System.out.println("\033[32mPrecio Total: " + precio);

        System.out.println("Lista de Aviones.");
        for (Avion listaAviones : listaAvion) {
            if (listaAviones instanceof AvionStandar) {
                AvionStandar x;
                x = ((AvionStandar) listaAviones);
                System.out.println("\033[31mAvion Standar");
                System.out.println("\033[36m      ~     ");
                System.out.println("\033[36m************");
                System.out.println("\033[34m" + x.getAerolinea());
                System.out.println("\033[36m**°******°**");
                System.out.println("\033[36m************");

                for (Silla r : x.getListaSilla()) {

                    if (r.isEstado() == false) {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[31m" + r.getFila() + "\033[31m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[32m" + r.getFila() + "\033[32m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");

            } else if (listaAviones instanceof AvionVIP) {
                AvionVIP x;
                x = ((AvionVIP) listaAviones);
                System.out.println("\033[34mAvion VIP");
                System.out.println("\033[36m      ~     ");
                System.out.println("\033[36m************");
                System.out.println("\033[34m" + x.getAerolinea());
                System.out.println("\033[36m**°******°**");
                System.out.println("\033[36m************");

                for (Silla r : x.getListaSilla()) {

                    if (r.isEstado() == false) {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[31m" + r.getFila() + "\033[31m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[32m" + r.getFila() + "\033[32m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            } else if (listaAviones instanceof AvionMix) {
                AvionMix x;
                x = ((AvionMix) listaAviones);
                System.out.println("\033[34mAvion Mix");
                System.out.println("\033[36m      ~     ");
                System.out.println("\033[36m************");
                System.out.println("\033[34m" + x.getAerolinea());
                System.out.println("\033[36m**°******°**");
                System.out.println("\033[36m************");

                for (Silla r : x.getListaSilla()) {

                    if (r.isEstado() == false) {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[31m" + r.getFila() + "\033[31m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[36m*****");
                        System.out.print("\033[32m" + r.getFila() + "\033[32m" + r.getColumna());
                        System.out.print("\033[36m*****");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            }
        }
        return sillaPrueba;
    }

}
