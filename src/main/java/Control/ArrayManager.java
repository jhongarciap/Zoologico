/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Bill;
import Model.Employee;
import Model.Plan;
import Model.Supply;
import Model.Transation;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author garci
 */
public class ArrayManager {
//Array de bill 
   private ArrayList<Bill> bill = new ArrayList<>();
   //inicializar
    public void addBill(Date date, String costormerName, String id, String product, String productld, String worth, String amount){
        Bill newBill = new Bill(date, costormerName, id, product, productld, worth, amount);
        bill.add(newBill);
    }
    //buscar
    public void searchBill(String id){
        for (int i = 0; i <= bill.size(); i++){
            if(id == bill.get(i).getId()){
                System.out.println(bill.get(i));
            }
    }   
    }
    //eliminar
    public void deteleteBill(String id){
        for (int i = 0; i <= bill.size(); i++){
            if(id == bill.get(i).getId()){
                bill.remove(i);
            }
        }
    }
    
   //Array de Plan
   private ArrayList<Plan> plan = new ArrayList<>();
   //inicializar
    public void addPlan(int amount, Float worth, String sfications, String product, String productId){
        Plan newPlan = new Plan(amount, worth, sfications, product, productId);
        plan.add(newPlan);
    }
    //buscar
    public void searchPlan(String productId){
        for (int i = 0; i <= plan.size(); i++){
            if(productId == plan.get(i).getProductId()){
                System.out.println(plan.get(i));
            }
    }   
    }
    //eliminar
    public void deteletePlan(String productId){
        for (int i = 0; i <= plan.size(); i++){
            if(productId == plan.get(i).getProductId()){
                plan.remove(i);
            }
    }   
    }
    
   //Array de Supply
   private ArrayList<Supply> suplly = new ArrayList<>();
     //inicializar
    public void addSupply(String name, String type, String animal, String amount, String specifications){
        Supply newSupply = new Supply(name, type, animal, amount, specifications);
        suplly.add(newSupply);
    }
    //buscar
    public void searchSupply(String name){
        for (int i = 0; i <= plan.size(); i++){
            if(name == suplly.get(i).getName()){
                System.out.println(suplly.get(i));
            }
    }   
    }
    //eliminar
     public void deleteSupply(String name){
        for (int i = 0; i <= plan.size(); i++){
            if(name == suplly.get(i).getName()){
                 suplly.remove(i);
            }
    }   
    }
     
   //Array de Transation
   private ArrayList<Transation> transation = new ArrayList<>();
    //inicializar
    public void addTransation(String Code, String name, Date date, Float income, Float expenses, Float profits, String especifications){
        Transation newtransation = new Transation(Code, name, date, income, expenses, profits, especifications);
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
   
   //Array de Wild
   private ArrayList<Employee> employe = new ArrayList<>();
    //inicializar
    public void addemployee(String post, String name, String funcions, String id){
        Employee newEmployew = new Employee(post, name, funcions, id);
        employe.add(newEmployew);
    }
    //buscar
    public void searchTransation(String id){
        for (int i = 0; i <= employe.size(); i++){
            if(id == employe.get(i).getId()){
                System.out.println(employe.get(i));
            }
    }   
    }
    //eliminar
     public void deleteTransation(String id){
        for (int i = 0; i <= employe.size(); i++){
            if(id == employe.get(i).getId()){
                transation.remove(i);
            }
    }   
    }
}
