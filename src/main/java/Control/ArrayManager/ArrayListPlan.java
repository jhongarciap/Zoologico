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
    private ArrayList<Plan> plans = new ArrayList<>();
    //Contrictor vacio

    public ArrayListPlan() {
    }

    //Añadir
    public void addPlan(Plan plan) {
        plans.add(plan);
    }
    //Mostrar el id de todos los planes 
    public int amountPlan;
    public Float valuePlan;
    public String sficationsPlan;
    public String productPlan;
    public String productIdPlan;

    public void  showPlans() {
        for (int i = 0; i <= plans.size(); i++) {
            amountPlan = plans.get(i).getAmount();
            valuePlan = plans.get(i).getValue();
            sficationsPlan = plans.get(i).getSfications();
            productIdPlan = plans.get(i).getProductId();
            productPlan = plans.get(i).getProduct();
        }
    }
    //buscar
    public void searchPlan(String productId) {
        for (int i = 0; i <= plans.size(); i++) {
            if (productId == plans.get(i).getProductId()) {
                System.out.println(plans.get(i));
            }
        }
    }

    //eliminar
    public void deteletePlan(String productId) {
        for (int i = 0; i <= plans.size(); i++) {
            if (productId == plans.get(i).getProductId()) {
                plans.remove(i);
            }
        }

    }
}
