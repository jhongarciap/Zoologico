/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Utilities.GenerateCodePlan.generateCodePlan;



/**
 *
 * @author garci
 */
public class Plan {
    private Float  value;
    private String sfications;
    private String product;
    private String productId;

   public Plan(String productId, String product, Float value, String sfications) {
        this.value = value;
        this.sfications = sfications;
        this.product = product;
        this.productId = generateCodePlan("PL");
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