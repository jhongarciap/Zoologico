/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.Domestic;
import java.util.ArrayList;

/**
 *
 * @author garci
 */
public class ArrayListDomestic {
    //Array de Employee

    private ArrayList<Domestic> domestics = new ArrayList<>();
    //Constructor vacio
    public ArrayListDomestic(){

    }

    //Añadir
    public void addDomestic(Domestic domestic) {
        domestics.add(domestic);
    }
    //Mustrar todos los empleados 
     public String nameDomestic; 
    public String raceDomestic; 
    public String sexDomestic; 
    public String habitadDomestic; 
    public String dietDomestic; 
    public String psycheDomestic;
    public String originDomestic;

    public void showDomestic() {
        for (int i = 0; i <= domestics.size(); i++) {
            nameDomestic= domestics.get(i).getName();
            raceDomestic= domestics.get(i).getRace();
            sexDomestic= domestics.get(i).getSex();
            habitadDomestic= domestics.get(i).getHabitad();
            dietDomestic= domestics.get(i).getDiet();
            psycheDomestic= domestics.get(i).getPsyche();
            originDomestic= domestics.get(i).getOrigin();
        }
    }

    //buscar
    public void searchDomestic(String name) {
        for (int i = 0; i <= domestics.size(); i++) {
            if (name == domestics.get(i).getName()) {
                System.out.println(domestics.get(i));
            }
        }
    }

    //eliminar
    public void deleteDomestic(String name) {
         for (int i = 0; i <= domestics.size(); i++) {
            if (name == domestics.get(i).getName()) {
                domestics.remove(i);
            }
        }
    }

}
