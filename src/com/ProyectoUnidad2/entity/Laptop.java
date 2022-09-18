/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoUnidad2.entity;

import java.util.ArrayList;

/**
 *
 * @author equipo4
 */
public class Laptop extends Producto {

    private int id;
    private int memoria;
    private double tamanoPantalla;

    public Laptop(int idProducto, String fabricante, String modelo, String microProcesador, int capacidadAlmacenamiento, int id, int memoria, int tamanoPantalla) {
        super(idProducto, fabricante, modelo, microProcesador, capacidadAlmacenamiento);
    }

    public Laptop() {

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

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    @Override
    public String toString() {
        return super.toString() + "\nid: " + id + "\nmemoria: " + memoria + "\nTamaño de Pantalla: " + tamanoPantalla;
    }

    private ArrayList<Laptop> listado = new ArrayList<>();

    public void insert(Laptop laptop, int valores) {

        int cantida = listado.size();
        laptop.setId(cantida + 1);
        laptop.setIdProducto(cantida + 1 + valores);

        listado.add(laptop);

    }

    public ArrayList<Laptop> listar() {
        return listado;
    }
}
