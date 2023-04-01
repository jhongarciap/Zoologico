/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.Supply;
import java.util.ArrayList;

/**
 *
 * @author garci
 */
public class ArrayListSupply {

    //Array de Supply
    private ArrayList<Supply> supllys = new ArrayList<>();
    //constructor vacio 

    public ArrayListSupply() {
    }

    //añadir
    public void addSupply(Supply supply) {
        supllys.add(supply);
    }
    //Mostrar todos los suplementos 
    public String nameSupply;
    public String typeSupply;
    public String animalSupply;
    public String amountSupply;
    public String specificationsSupply;

    public void searchSupply() {
        for (int i = 0; i <= supllys.size(); i++) {
            nameSupply = supllys.get(i).getName();
            typeSupply = supllys.get(i).getType();
            animalSupply = supllys.get(i).getAnimal();
            amountSupply = supllys.get(i).getAmount();
            specificationsSupply = supllys.get(i).getSpecifications();
        }
    }

    //buscar
    public void searchSupply(String name) {
        for (int i = 0; i <= supllys.size(); i++) {
            if (name == supllys.get(i).getName()) {
                System.out.println(supllys.get(i));
            }
        }
    }

    //eliminar
    public void deleteSupply(String name) {
        for (int i = 0; i <= supllys.size(); i++) {
            if (name == supllys.get(i).getName()) {
                supllys.remove(i);
            }
        }
    }
}
