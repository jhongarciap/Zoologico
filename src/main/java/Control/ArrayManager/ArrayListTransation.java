/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.Transation;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author garci
 */
public class ArrayListTransation {
    //Array de Transation
   private ArrayList<Transation> transation = new ArrayList<>();
    //inicializar
    public void addTransation(String code, String name, Float discount, Date date, Float income, Float expenses, Float profits, String especifications){
        Transation newtransation = new Transation(code, name, discount, date, income, expenses, profits, especifications);
        transation.add(newtransation);
    }
    //buscar
    public void searchTransation(Date date){
        for (int i = 0; i <= transation.size(); i++){
            if(date == transation.get(i).getDate()){
                System.out.println(transation.get(i));
            }
    }   
    }
    //eliminar
    public void deleteTransation(Date date){
        for (int i = 0; i <= transation.size(); i++){
            if(date == transation.get(i).getDate()){
                transation.remove(i);
            }
    }   
    }
    
}
