/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.Minor;
import java.util.ArrayList;

/**
 *
 * @author garci
 */
public class ArrayListMinor {
    //Array de Employee

    private ArrayList<Minor> minors = new ArrayList<>();
    //Constructor vacio
    public ArrayListMinor(){

    }

    //Añadir
    public void addDomestic(Minor minor) {
        minors.add(minor);
    }
    //Mustrar todos los empleados 
     public String nameMinor; 
    public String raceMinor; 
    public String sexMinor; 
    public String habitadMinor; 
    public String dietMinor; 
    public String nativeClimateMinor;
    public String diseasesMinor;

    public void showDomestic() {
        for (int i = 0; i <= minors.size(); i++) {
            nameMinor= minors.get(i).getName();
            raceMinor= minors.get(i).getRace();
            sexMinor= minors.get(i).getSex();
            habitadMinor= minors.get(i).getHabitad();
            dietMinor= minors.get(i).getDiet();
            nativeClimateMinor= minors.get(i).getNativeClimate();
            diseasesMinor= minors.get(i).getDiseases();
        }
    }

    //buscar
    public void searchDomestic(String name) {
        for (int i = 0; i <= minors.size(); i++) {
            if (name == minors.get(i).getName()) {
                System.out.println(minors.get(i));
            }
        }
    }

    //eliminar
    public void deleteDomestic(String name) {
         for (int i = 0; i <= minors.size(); i++) {
            if (name == minors.get(i).getName()) {
                minors.remove(i);
            }
        }
    }

}
