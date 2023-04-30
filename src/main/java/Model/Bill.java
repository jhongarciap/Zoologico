package Model;

import static Utilities.CurrentDate.currentDate;

/**
 *
 * @author garci
 */
public class Bill {

    private final String date;
    private Float value;
    private Float discount;
    Float totalvalue;
    private String costormerName;
    private String product;
    private String productld;
    private int amount;

    public Bill(String date, Float value, Float discount, Float totalvalue, String costormerName, String product, String productld, int amount) {
        this.date = currentDate();
        this.value = value;
        this.discount = discount;
        this.totalvalue = amount*value+(1-discount);
        this.costormerName = costormerName;
        this.product = product;
        this.productld = productld;
        this.amount = amount;
    }
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */

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

   
}
