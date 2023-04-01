/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.Wild;
import java.util.ArrayList;

/**
 *
 * @author garci
 */
public class ArrayListWild {
    //Array de Employee

    private ArrayList<Wild> wilds = new ArrayList<>();
    //Constructor vacio
    public ArrayListWild(){

    }

    //Añadir
    public void addDomestic(Wild wild) {
        wilds.add(wild);
    }
    //Mustrar todos los empleados 
     public String nameWild; 
    public String raceWild; 
    public String sexWild; 
    public String habitadWild; 
    public String dietWild; 
    public String birthhabitat;
    public String dangerousness;

    public void showDomestic() {
        for (int i = 0; i <= wilds.size(); i++) {
            nameWild= wilds.get(i).getName();
            raceWild= wilds.get(i).getRace();
            sexWild= wilds.get(i).getSex();
            habitadWild= wilds.get(i).getHabitad();
            dietWild= wilds.get(i).getDiet();
            birthhabitat= wilds.get(i).getBirthhabitat();
            dangerousness= wilds.get(i).getDangerousness();
        }
    }

    //buscar
    public void searchDomestic(String name) {
        for (int i = 0; i <= wilds.size(); i++) {
            if (name == wilds.get(i).getName()) {
                System.out.println(wilds.get(i));
            }
        }
    }

    //eliminar
    public void deleteDomestic(String name) {
         for (int i = 0; i <= wilds.size(); i++) {
            if (name == wilds.get(i).getName()) {
                wilds.remove(i);
            }
        }
    }

}
