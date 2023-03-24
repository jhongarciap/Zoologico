/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author garci
 */
public class Bill {
     private Date date;
     private String costormerName;
     private String id; 
     private String product; 
     private String productld; 
     private String worth; 
     private String amount; 

    public Bill(Date date, String costormerName, String id, String product, String productld, String worth, String amount) {
        this.date = date;
        this.costormerName = costormerName;
        this.id = id;
        this.product = product;
        this.productld = productld;
        this.worth = worth;
        this.amount = amount;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the costormerName
     */
    public String getCostormerName() {
        return costormerName;
    }

    /**
     * @param costormerName the costormerName to set
     */
    public void setCostormerName(String costormerName) {
        this.costormerName = costormerName;
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

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the productld
     */
    public String getProductld() {
        return productld;
    }

    /**
     * @param productld the productld to set
     */
    public void setProductld(String productld) {
        this.productld = productld;
    }

    /**
     * @return the worth
     */
    public String getWorth() {
        return worth;
    }

    /**
     * @param worth the worth to set
     */
    public void setWorth(String worth) {
        this.worth = worth;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
     
     



    
}
