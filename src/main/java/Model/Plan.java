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
public class Plan {
    private Date date;
    private int  amount;
    private Float  value;
    private Float discount;
    private Float totalvalue;
    private String sfications;
    private String product;
    private String productId;

    public Plan(Date date, int amount, Float value, Float Discount, Float totalvalue, String sfications, String product, String productId) {
        this.date=date;
        this.amount = amount;
        this.value = value;
        this.discount = Discount;
        this.totalvalue = value*amount*(1-discount);
        this.sfications = sfications;
        this.product = product;
        this.productId = productId;
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
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the value
     */
    public Float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * @return the discount
     */
    public Float getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    /**
     * @return the totalvalue
     */
    public Float getTotalvalue() {
        return totalvalue;
    }

    /**
     * @param totalvalue the totalvalue to set
     */
    public void setTotalvalue(Float totalvalue) {
        this.totalvalue = totalvalue;
    }

    /**
     * @return the sfications
     */
    public String getSfications() {
        return sfications;
    }

    /**
     * @param sfications the sfications to set
     */
    public void setSfications(String sfications) {
        this.sfications = sfications;
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
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

   

}