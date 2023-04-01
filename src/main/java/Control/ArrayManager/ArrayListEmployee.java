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

    private ArrayList<Employee> employees = new ArrayList<>();

    public ArrayListEmployee() {

    }

    //Añadir
    public void addemployee(Employee employee) {
        employees.add(employee);
    }
    //Mustrar todos los empleados 
    public String postEmployees;
    public String namEmployeese;
    public String funcionsEmployees;
    public String idEmployees;

    public void showEmployees() {
        for (int i = 0; i <= employees.size(); i++) {
            idEmployees = employees.get(i).getId();
            namEmployeese = employees.get(i).getId();
            postEmployees = employees.get(i).getPost();
            funcionsEmployees = employees.get(i).getFuncions();
        }
    }
   
    //buscar
    public void searchTransation(String id) {
        for (int i = 0; i <= employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                System.out.println(employees.get(i));
            }
        }
    }

    //eliminar
    public void deleteTransation(String id) {
        for (int i = 0; i <= employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                employees.remove(i);
            }
        }
    }

}
