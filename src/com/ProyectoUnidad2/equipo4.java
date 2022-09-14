/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ProyectoUnidad2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.ProyectoUnidad2.entity.Laptop;

/**
 *
 * @author equipo4
 */
public class equipo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenidos a TODOPC, \n"
                + "El control auténtico de tus equipos. \n"
                + "El sistema lo hace por ti.", "Mensaje de bienvenida",
                JOptionPane.INFORMATION_MESSAGE);
        
        Laptop d=new Laptop();
        d.setId(1);
        d.setFabricante("Dell");
        d.setIdProducto(2);
        d.setTamanoPantalla(15.5);
        System.out.println("Objeto Desktop "+d.getTamanoPantalla());
        // TODO code application logic here
    }
    
}
