/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Utilidades.GenerateCodeBillSale.generateCodeSale;




/**
 *
 * @author garci
 */
public class BillSale  extends Bill{
    
    private String code;    

    public BillSale(String code, String date, Float value, Float discount, Float totalvalue, String costormerName, String product, String productld, int amount) {
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
