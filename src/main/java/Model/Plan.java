package Model;

import Utilities.GenerateCodePlan;



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
        GenerateCodePlan generator = new GenerateCodePlan();
        this.productId = generator.generateCode("PL");
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