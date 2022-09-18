/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ProyectoUnidad2;

import com.ProyectoUnidad2.entity.Desktop;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.ProyectoUnidad2.entity.Laptop;
import java.util.Objects;

/**
 *
 * @author equipo4
 */
public class equipo4 {

    static String[] arreglo_opciones = {"Laptop", "Tablet", "Descktop"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fabricante, modelo, procesador;
        int almacenamiento, memoria;
        double torre;

        ArrayList<Desktop> datosDesktop = new ArrayList<>();
        Laptop laptopDato = new Laptop();
        JOptionPane.showMessageDialog(null, "Usted a iniciado el sistema de inventario", "Mensaje de bienvenida",
                JOptionPane.INFORMATION_MESSAGE);

        int opcion = 0;
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

                            laptopDato.insert(laptop, datosDesktop.size());
                        }

                        break;
                        case 1: {
                        }

                        break;
                        case 2: {
                            fabricante = validarDatoString("Ingrese el nombre del fabricante: ");
                            modelo = validarDatoString("Ingrese el modelo: ");
                            procesador = validarDatoString("Ingrese el Micro Procesador: ");
                            almacenamiento = validarDatoInt("Ingrese la Capacidad de Almacenamiento GB: ");
                            memoria = validarDatoInt("Ingrese la capaciadad de memoria en GB: ");
                            torre = validarDatoDouble("Ingrese el tamaño de torre en Pulgadas: ");
                            int valortotal=laptopDato.listar().size()+datosDesktop.size()+1;
                            Desktop desktop = new Desktop(valortotal, fabricante, modelo, procesador, almacenamiento, datosDesktop.size()+1, memoria, torre);
                        }

                        break;
                        default:
                            throw new AssertionError();
                    }
                }

                break;

                case 2: {
                    int opcionTipo = JOptionPane.showOptionDialog(null, "Elige tipo de Equipo a Registrar", "Elige: ", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo_opciones, null);
               
                    switch (opcionTipo) {
                        case 0:{
                        laptopDato.listar().forEach(x->JOptionPane.showMessageDialog(null, x,"Detalle laptop",JOptionPane.INFORMATION_MESSAGE));
                        }
                            
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                break;
                default:
                    throw new AssertionError();
            }
        } while (true);
        // TODO code application logic here
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
        int val;
        val = Integer.parseInt(JOptionPane.showInputDialog(null, msg, "Ingreso datos", JOptionPane.INFORMATION_MESSAGE));
        while (val < 0 || Objects.isNull(val)) {
            val = Integer.parseInt(JOptionPane.showInputDialog(null, "Dato invalido o vacio.\n" + msg, "Ingreso datos", JOptionPane.INFORMATION_MESSAGE));
        }
        return val;
    }

    public static double validarDatoDouble(String msg) {
        double val;
        val = Double.parseDouble(JOptionPane.showInputDialog(null, msg, "Ingreso datos", JOptionPane.INFORMATION_MESSAGE));
        while (val < 0 || Objects.isNull(val)) {
            val = Integer.parseInt(JOptionPane.showInputDialog(null, "Dato invalido o vacio.\n" + msg, "Ingreso datos", JOptionPane.INFORMATION_MESSAGE));
        }
        return val;
    }

}
