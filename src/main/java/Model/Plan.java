/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author garci
 */
public class Plan {
    private int  amount;
    private Float worth;
    private String sfications;
    private String product;
    private String productId;

    public Plan(int amount, Float worth, String sfications, String product, String productId) {
        this.amount = amount;
        this.worth = worth;
        this.sfications = sfications;
        this.product = product;
        this.productId = productId;
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
     * @return the worth
     */
    public Float getWorth() {
        return worth;
    }

    /**
     * @param worth the worth to set
     */
    public void setWorth(Float worth) {
        this.worth = worth;
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
