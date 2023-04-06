/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Utilities.GenerateCodeBillSale.generateCodeSale;




/**
 *
 * @author garci
 */
public class SaleBill  extends Bill{
    
    private String code;    

    public SaleBill(String code, String date, Float value, Float discount,int amount, Float totalvalue, String costormerName, String product, String productld) {
        super(date, value, discount, totalvalue, costormerName, product, productld, amount);
        this.code = generateCodeSale("BS");
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
