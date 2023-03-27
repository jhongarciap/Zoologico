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
   private ArrayList<Supply> suplly = new ArrayList<>();
     //inicializar
    public void addSupply(String name, String type, String animal, String amount, String specifications){
        Supply newSupply = new Supply(name, type, animal, amount, specifications);
        suplly.add(newSupply);
    }
    //buscar
    public void searchSupply(String name){
        for (int i = 0; i <= suplly.size(); i++){
            if(name == suplly.get(i).getName()){
                System.out.println(suplly.get(i));
            }
    }   
    }
    //eliminar
     public void deleteSupply(String name){
        for (int i = 0; i <= suplly.size(); i++){
            if(name == suplly.get(i).getName()){
                 suplly.remove(i);
            }
    }   
     }
}
