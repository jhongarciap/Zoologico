/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zoosantafe.zoologico;

/**
 *
 * @author juan.castro17
 */
public class SavageAnimals extends Animals{
    private String peligrosidad;
    private String habitad;
    private String especie;

    public SavageAnimals() {
    }

    public SavageAnimals(String peligrosidad, String habitad, String especie, int codigo, String nombre, float peso) {
        super(codigo, nombre, peso);
        this.peligrosidad = peligrosidad;
        this.habitad = habitad;
        this.especie = especie;
    }

    /**
     * @return the peligrosidad
     */
    public String getPeligrosidad() {
        return peligrosidad;
    }

    /**
     * @param peligrosidad the peligrosidad to set
     */
    public void setPeligrosidad(String peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    /**
     * @return the habitad
     */
    public String getHabitad() {
        return habitad;
    }

    /**
     * @param habitad the habitad to set
     */
    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SavageAnimals{");
        sb.append("peligrosidad=").append(peligrosidad);
        sb.append(", habitad=").append(habitad);
        sb.append(", especie=").append(especie);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
