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
     private String post;
     private String name;
     private String funcions;
     private String id;
     
    public Employee(String post, String name, String funcions, String id) {
        this.post = post;
        this.name = name;
        this.funcions = funcions;
        this.id = id;
    }
    /**
     * @return the post
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(String post) {
        this.post = post;
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
