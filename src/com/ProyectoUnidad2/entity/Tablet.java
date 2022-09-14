/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoUnidad2.entity;

/**
 *
 * @author equipo4
 */
public class Tablet extends Producto{
     private int id;
    private Boolean capasidadReseptivo;//0 cabasitiva 1 Resistiva
    private double tamanoDiagonalPantalla;
    private String sistemaOperativo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getCapasidadReseptivo() {
        return capasidadReseptivo;
    }

    public void setCapasidadReseptivo(Boolean capasidadReseptivo) {
        this.capasidadReseptivo = capasidadReseptivo;
    }

    public double getTamanoDiagonalPantalla() {
        return tamanoDiagonalPantalla;
    }

    public void setTamanoDiagonalPantalla(double tamanoDiagonalPantalla) {
        this.tamanoDiagonalPantalla = tamanoDiagonalPantalla;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    
}
