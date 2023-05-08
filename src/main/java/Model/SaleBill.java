package Model;

import Utilities.GenerateCodeBillSale;

/**
 *
 * @author garci
 */
public class SaleBill extends Bill {

    private String code;

    public SaleBill(String code, String date, Float value, Float discount, int amount, Float totalvalue, String costormerName, String product, String productld) {
        super(date, value, discount, totalvalue, costormerName, product, productld, amount);
        GenerateCodeBillSale generator = new GenerateCodeBillSale();
        this.code = generator.generateCode("BS");
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

}
