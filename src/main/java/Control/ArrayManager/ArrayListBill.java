/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.Bill;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author garci
 */
public class ArrayListBill {
    //Array de bill 
   private ArrayList<Bill> bill = new ArrayList<>();
   //inicializar
    public void addBill(Date date, String costormerName, String id, String product, String productld, String worth, String amount){
        Bill newBill = new Bill(date, costormerName, id, product, productld, worth, amount);
        bill.add(newBill);
    }
    //buscar
    public void searchBill(Date date){
        for (int i = 0; i <= bill.size(); i++){
            if(date == bill.get(i).getDate()){
                System.out.println(bill.get(i));
            }
    }   
    }
    //eliminar
    public void deteleteBill(Date date){
        for (int i = 0; i <= bill.size(); i++){
            if(date == bill.get(i).getDate()){
                bill.remove(i);
            }
        }
    }
    
}
