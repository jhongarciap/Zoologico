/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.ArrayManager;

import Model.Employee;
import java.util.ArrayList;

/**
 *
 * @author garci
 */
public class ArrayListEmployee {
    //Array de Employee 
   private ArrayList<Employee> employee = new ArrayList<>();
    //inicializar
    public void addemployee(String post, String name, String funcions, String id){
        Employee newEmployew = new Employee(post, name, funcions, id);
        employee.add(newEmployew);
    }
    //buscar
    public void searchTransation(String id){
        for (int i = 0; i <= employee.size(); i++){
            if(id == employee.get(i).getId()){
                System.out.println(employee.get(i));
            }
    }   
    }
    //eliminar
     public void deleteTransation(String id){
        for (int i = 0; i <= employee.size(); i++){
            if(id == employee.get(i).getId()){
                employee.remove(i);
            }
    }   
    }
    
}
