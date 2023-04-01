/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.Transation;
import java.util.ArrayList;
/**
 *
 * @author garci
 */
public class ArrayListTransation {

    //Array de Transation
    private ArrayList<Transation> transations = new ArrayList<>();
    //constructor vacio 

    public ArrayListTransation() {
    }

    //Añadir
    public void addTransation(Transation transation) {
        transations.add(transation);
    }
    // mostrar todas las transaciones
        public String codeTransation;
        public String nameTransation;
        public Float discountTransation;
        public String dateTransation;
        public Float incomeTransation;
        public Float expensesTransation;
        public Float profitsTransation;
        public String especificationsTransation;
  
    public void sshowTransation(String date) {
        for (int i = 0; i <= transations.size(); i++) {
            codeTransation= transations.get(i).getCode();
            nameTransation= transations.get(i).getName();
            discountTransation= transations.get(i).getDiscount();
            dateTransation= transations.get(i).getDate();
            incomeTransation= transations.get(i).getIncome();
            expensesTransation= transations.get(i).getExpenses();
            profitsTransation= transations.get(i).getProfits();
            especificationsTransation= transations.get(i).getEspecifications();
            }
    }

    //buscar
    public void searchTransation(String date) {
        for (int i = 0; i <= transations.size(); i++) {
            if (date == transations.get(i).getDate()) {
                System.out.println(transations.get(i));
            }
        }
    }

    //eliminar
    public void deleteTransation(String date) {
        for (int i = 0; i <= transations.size(); i++) {
            if (date == transations.get(i).getDate()) {
                transations.remove(i);
            }
        }
    }

}
