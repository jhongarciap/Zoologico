/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zoosantafe.zoologico;

/**
 *
 * @author juan.castro17
 */
public class MinorSpecies extends Animals {
    private String nombreVulgar;
     private String habitad;
     private String uso;

    public MinorSpecies() {
    }

    public MinorSpecies(String nombreVulgar, String habitad, String uso, int codigo, String nombre, float peso) {
        super(codigo, nombre, peso);
        this.nombreVulgar = nombreVulgar;
        this.habitad = habitad;
        this.uso = uso;
    }

    /**
     * @return the nombreVulgar
     */
    public String getNombreVulgar() {
        return nombreVulgar;
    }

    /**
     * @param nombreVulgar the nombreVulgar to set
     */
    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
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
     * @return the uso
     */
    public String getUso() {
        return uso;
    }

    /**
     * @param uso the uso to set
     */
    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MinorSpecies{");
        sb.append("nombreVulgar=").append(nombreVulgar);
        sb.append(", habitad=").append(habitad);
        sb.append(", uso=").append(uso);
        sb.append('}');
        return sb.toString();
    }

    
     
    
}
