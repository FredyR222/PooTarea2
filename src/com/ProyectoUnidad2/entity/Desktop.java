/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoUnidad2.entity;

/**
 *
 * @author equipo4
 */
public class Desktop extends Producto{
    private int id;
    private int memoria;
    private double tamanoTorre;
   // private Producto producto;
public Desktop(int idProducto, String fabricante, String modelo, String microProcesador, int capacidadAlmacenamiento, int id, int memoria, double tamanoTorre){
     super(idProducto, fabricante, modelo, microProcesador, capacidadAlmacenamiento);
     
 }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamanoTorre() {
        return tamanoTorre;
    }

    public void setTamanoTorre(double tamanoTorre) {
        this.tamanoTorre = tamanoTorre;
    }
    @Override
    public String toString() {
        return  super.toString() + "\nid: " + id + "\nmemoria: " + memoria + "\nTamaño de Torre: " + tamanoTorre;
        
                
    }
    
}
