/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zoosantafe.zoologico;

/**
 *
 * @author juan.castro17
 */
public class Users extends People{
   private String trabaja;
   private int frecuenciaAnual;
   private Double abono;

    public Users() {
    }
   
   

    public Users(String trabaja, int frecuenciaAnual, Double abono, String Nombre, String identificacion, int edad) {
        super(Nombre, identificacion, edad);
        this.trabaja = trabaja;
        this.frecuenciaAnual = frecuenciaAnual;
        this.abono = abono;
    }

    /**
     * @return the trabaja
     */
    public String getTrabaja() {
        return trabaja;
    }

    /**
     * @param trabaja the trabaja to set
     */
    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    /**
     * @return the frecuenciaAnual
     */
    public int getFrecuenciaAnual() {
        return frecuenciaAnual;
    }

    /**
     * @param frecuenciaAnual the frecuenciaAnual to set
     */
    public void setFrecuenciaAnual(int frecuenciaAnual) {
        this.frecuenciaAnual = frecuenciaAnual;
    }

    /**
     * @return the abono
     */
    public Double getAbono() {
        return abono;
    }

    /**
     * @param abono the abono to set
     */
    public void setAbono(Double abono) {
        this.abono = abono;
    }

    @Override
    public String toString() {
        return "Users{" + "trabaja=" + trabaja + ", frecuenciaAnual=" + frecuenciaAnual + ", abono=" + abono + '}';
    }

    
   
}
