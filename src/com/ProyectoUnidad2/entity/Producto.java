/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoUnidad2.entity;

/**
 *
 * @author equipo4
 */
public class Producto {
    private int idProducto ;
    private String fabricante;
    private String modelo;
    private String microProcesador;
    private int capacidadAlmacenamiento;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMicroProcesador() {
        return microProcesador;
    }

    public void setMicroProcesador(String microProcesador) {
        this.microProcesador = microProcesador;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public Producto() {
    }

    public Producto(int idProducto, String fabricante, String modelo, String microProcesador, int capacidadAlmacenamiento) {
        this.idProducto = idProducto;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microProcesador = microProcesador;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }
    
    
}
