/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoosantafe.zoologico;

import java.util.Date;

public class Venta {
    private Date fecha;
    private String producto;
    private double monto, valor, cantidad;

    public Venta(Date fecha, String producto, double valor, double cantidad) {
        this.fecha = fecha;
        this.producto = producto;
        this.valor = valor;
        this.cantidad = cantidad;
        this.monto = valor * cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}