/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author garci
 */
public class Employee {
     private String lastName;
     private String name;
     private String funcions;
     private String id;
     
    public Employee(String id,String name, String lastName,String funcions) {
        this.lastName = lastName;
        this.name = name;
        this.funcions = funcions;
        this.id = id;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the funcions
     */
    public String getFuncions() {
        return funcions;
    }

    /**
     * @param funcions the funcions to set
     */
    public void setFuncions(String funcions) {
        this.funcions = funcions;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
}
