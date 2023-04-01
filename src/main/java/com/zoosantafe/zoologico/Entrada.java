/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoosantafe.zoologico;

/**
 *
 * @author aguir
 */
public class Entrada {
    
    private String entrada;
    private double monto;
    
    public Entrada(String entrada, double monto) {
        this.entrada = entrada;
        this.monto = monto;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
}
