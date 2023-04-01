/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.Bill;
import java.util.ArrayList;

/**
 *
 * @author garci
 */
public class ArrayListBill {
    //Array de bill 
   private ArrayList<Bill> bills = new ArrayList<>();
   //añadir 
    public void addBill(Bill bill){
        bills.add(bill);
    }
    public String dateBill;
    public Float valueBill;
    public Float discountBill;
    public Float totalvalueBill;
    public String costormerNameBill;
    public String productBill;
    public String productldBill;
    public int amountBill;
    //Mostrar toda la array  
    public void showBills(){
        for (int i = 0; i <= bills.size(); i++){
            dateBill=bills.get(i).getDate();
            valueBill=bills.get(i).getValue();
            discountBill=bills.get(i).getDiscount();
            totalvalueBill=bills.get(i).getTotalvalue();
            costormerNameBill=bills.get(i).getCostormerName();
            productBill=bills.get(i).getProduct();
            productldBill=bills.get(i).getProductld();
            amountBill=bills.get(i).getAmount();
        }
    }     
    //buscar
    public void searchBill(String date){
        for (int i = 0; i <= bills.size(); i++){
            if(date == bills.get(i).getDate()){
                System.out.println(bills.get(i));
            }
    }   
    }
    //eliminar
    public void deteleteBill(String date){
        for (int i = 0; i <= bills.size(); i++){
            if(date == bills.get(i).getDate()){
                bills.remove(i);
            }
        }
    }
    
}
