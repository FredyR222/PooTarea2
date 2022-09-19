/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ProyectoUnidad2;

import com.ProyectoUnidad2.entity.Desktop;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.ProyectoUnidad2.entity.Laptop;
import com.ProyectoUnidad2.entity.Tablet;
import java.util.Objects;

/**
 *
 * @author equipo4
 */
public class equipo4 {

    static String[] arreglo_opciones = {"Laptop", "Tablet", "Descktop"};
    static String[] pantalla = {"Capacitiva", "Resitiva"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fabricante, modelo, procesador, sistemaOperativo;
        int almacenamiento, memoria;
        double torre, tamanoDiagonalPantalla;
        Boolean capasidadReseptivo;

        ArrayList<Desktop> datosDesktop = new ArrayList<>();
        ArrayList<Tablet> datosTablet = new ArrayList<>();

        Laptop laptopDato = new Laptop();
        JOptionPane.showMessageDialog(null, "Usted a iniciado el sistema de inventario", "Mensaje de bienvenida",
                JOptionPane.INFORMATION_MESSAGE);
        int opcion = 0;
        boolean continuar = true;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor elija la opcion que desea realizar."
                    + "\n1. Registrar Equipo"
                    + "\n2. Ver equipos"
                    + "\n3. Salir", "Opciones", JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
                case 1: {
                    int opcionTipo = JOptionPane.showOptionDialog(null, "Elige tipo de Equipo a Registrar", "Elige: ", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo_opciones, null);
                    switch (opcionTipo) {
                        case 0: {
                            Laptop laptop = new Laptop();
                            laptop.setFabricante(validarDatoString("Ingrese el nombre del fabricante: "));
                            laptop.setModelo(validarDatoString("Ingrese el modelo: "));
                            laptop.setMicroProcesador(validarDatoString("Ingrese el Micro Procesador: "));
                            laptop.setCapacidadAlmacenamiento(validarDatoInt("Ingrese la Capacidad de Almacenamiento GB: "));
                            laptop.setMemoria(validarDatoInt("Ingrese la capaciadad de memoria en GB: "));
                            laptop.setTamanoPantalla(validarDatoDouble("Ingrese el tamaño de pantalla en Pulgadas: "));

                            laptopDato.insert(laptop, datosTablet.size() + datosDesktop.size());
                        }

                        break;
                        case 1: {
                            fabricante = validarDatoString("Ingrese el nombre del fabricante: ");
                            modelo = validarDatoString("Ingrese el modelo: ");
                            procesador = validarDatoString("Ingrese el Micro Procesador: ");
                            almacenamiento = validarDatoInt("Ingrese la Capacidad de Almacenamiento GB: ");
                            sistemaOperativo = validarDatoString("Sistema operativo: ");
                            int elejidoPantalla = JOptionPane.showOptionDialog(null, "Tipo pantalla", "Elige: ", 0, JOptionPane.QUESTION_MESSAGE, null, pantalla, null);
                            if (elejidoPantalla == 1) {
                                capasidadReseptivo = true;
                            } else {
                                capasidadReseptivo = false;
                            }

                            tamanoDiagonalPantalla = validarDatoDouble("Ingrese el tamaño de Pantalla Diagonal Inch: ");

                            int valortotal = datosTablet.size() + laptopDato.listar().size() + datosDesktop.size() + 1;
                            Tablet tablet = new Tablet(valortotal, fabricante, modelo, procesador, almacenamiento, capasidadReseptivo, datosTablet.size() + 1, tamanoDiagonalPantalla, sistemaOperativo);
                            datosTablet.add(tablet);
                        }

                        break;
                        case 2: {
                            fabricante = validarDatoString("Ingrese el nombre del fabricante: ");
                            modelo = validarDatoString("Ingrese el modelo: ");
                            procesador = validarDatoString("Ingrese el Micro Procesador: ");
                            almacenamiento = validarDatoInt("Ingrese la Capacidad de Almacenamiento GB: ");
                            memoria = validarDatoInt("Ingrese la capaciadad de memoria en GB: ");
                            torre = validarDatoDouble("Ingrese el tamaño de torre en Pulgadas: ");
                            int valortotal = datosTablet.size() + laptopDato.listar().size() + datosDesktop.size() + 1;
                            Desktop desktop = new Desktop(valortotal, fabricante, modelo, procesador, almacenamiento, datosDesktop.size() + 1, memoria, torre);
                            datosDesktop.add(desktop);
                        }
                        break;

                        default:
                            throw new AssertionError();
                    }
                }

                break;

                case 2: {
                    int opcionTipo = JOptionPane.showOptionDialog(null, "Elige tipo de Equipo a Mostrar", "Elige: ", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo_opciones, null);

                    switch (opcionTipo) {
                        case 0: {
                            String salida = "";
                            ArrayList<Laptop> listado = laptopDato.listar();
                            for (int i = 0; i < listado.size(); i++) {
                                salida = salida + "\n" + listado.get(i).getFabricante() + " " + listado.get(i).getModelo() + " " + listado.get(i).getMicroProcesador() + " ID" + listado.get(i).getId() + ""
                                        + " Espacio de Almacenamiento GB: " + listado.get(i).getCapacidadAlmacenamiento() + " Memoria GB: " + listado.get(i).getMemoria() + " Pantalla Inch: " + listado.get(i).getTamanoPantalla();

                            }
                            JOptionPane.showMessageDialog(null, salida, "Detalle laptop", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        case 1: {
                            String salida = "";

                            for (int i = 0; i < datosTablet.size(); i++) {

                                System.out.println("*** " + datosTablet.get(i).getCapasidadReseptivo());
                                salida = salida + "\n" + datosTablet.get(i).getFabricante() + " " + datosTablet.get(i).getModelo() + " " + datosTablet.get(i).getMicroProcesador() + " Id" + datosTablet.get(i).getId() + ""
                                        + " Espacio de Almacenamiento GB: " + datosTablet.get(i).getCapacidadAlmacenamiento() + " Sistema Operativo: " + datosTablet.get(i).getSistemaOperativo() + ""
                                        + " Tamaño DiagonalPantalla Inch: " + datosTablet.get(i).getTamanoDiagonalPantalla() + " Tipo pantalla: " + pantalla[boolToInt(datosTablet.get(i).getCapasidadReseptivo())];

                            }
                            JOptionPane.showMessageDialog(null, salida, "Detalle Desktop", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        case 2: {
                            String salida = "";

                            for (int i = 0; i < datosDesktop.size(); i++) {
                                salida = salida + "\n" + datosDesktop.get(i).getFabricante() + " " + datosDesktop.get(i).getModelo() + " " + datosDesktop.get(i).getMicroProcesador() + " Id" + datosDesktop.get(i).getId() + ""
                                        + " Espacio de Almacenamiento GB: " + datosDesktop.get(i).getCapacidadAlmacenamiento() + " Memoria GB: " + datosDesktop.get(i).getMemoria() + " Tamaño torre Inch: " + datosDesktop.get(i).getTamanoTorre();

                            }
                            JOptionPane.showMessageDialog(null, salida, "Detalle Desktop", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        default:
                            throw new AssertionError();
                    }
                }
                break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usrar inventario =)", "Salida",
                            JOptionPane.INFORMATION_MESSAGE);
                    continuar = Boolean.FALSE;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida", "Error!!!",
                            JOptionPane.ERROR_MESSAGE);

            }
        } while (continuar);
    }

    public static String validarDatoString(String msg) {
        String val;
        val = JOptionPane.showInputDialog(null, msg, "Ingreso datos", JOptionPane.INFORMATION_MESSAGE);
        while (val.isEmpty()) {
            val = JOptionPane.showInputDialog(null, "Dato invalido o vacio.\n" + msg, "Ingreso datos", JOptionPane.INFORMATION_MESSAGE);
        }
        return val;
    }

    public static int validarDatoInt(String msg) {
        int val = 0;
        try {
            val = Integer.parseInt(JOptionPane.showInputDialog(null, msg, "Ingreso datos", JOptionPane.INFORMATION_MESSAGE));
        } catch (Exception e) {
            val = Integer.parseInt(JOptionPane.showInputDialog(null, "Dato invalido o vacio.\n" + msg, "Ingreso datos", JOptionPane.INFORMATION_MESSAGE));
        }
        while (val < 0 || Objects.isNull(val)) {
            validarDatoInt(msg);
        }
        return val;
    }

    public static double validarDatoDouble(String msg) {
        double val = 0.0;
        try {
            val = Double.parseDouble(JOptionPane.showInputDialog(null, msg, "Ingreso datos", JOptionPane.INFORMATION_MESSAGE));
        } catch (Exception e) {
            val = Double.parseDouble(JOptionPane.showInputDialog(null, "Dato invalido o vacio.\n" + msg, "Ingreso datos", JOptionPane.INFORMATION_MESSAGE));
        }
        while (val < 0 || Objects.isNull(val)) {
            validarDatoInt(msg);
        }
        return val;
    }

    public static int boolToInt(boolean b) {
        return b ? 1 : 0;
    }

}
