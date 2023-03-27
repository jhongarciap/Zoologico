/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.Plan;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author garci
 */
public class ArrayListPlan {
    //Array de Plan
   private ArrayList<Plan> plan = new ArrayList<>();
   //inicializar
    public void addPlan(Date date, int amount, Float value, Float Discount, Float totalvalue, String sfications, String product, String productId){
        Plan newPlan = new Plan(date,amount, value, Discount, totalvalue, sfications, product, productId);
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
}