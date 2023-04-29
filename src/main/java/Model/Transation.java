package Model;

import static Utilities.CurrentDate.currentDate;
import static Utilities.GenerateCodeTransation.generateCodeTransation;
/**
 *
 * @author garci
 */
public class Transation {

    private String code;
    private String name;
    private Float discount;
    private String date;
    private Float income;
    private Float expenses;
    private Float profits;
    private String especifications;

    public Transation(String code, String name, Float discount, String date, Float income, Float expenses, Float profits, String especifications) {
        this.code = generateCodeTransation("TRS");
        this.name = name;
        this.discount = discount;
        this.date = currentDate();
        this.income = income;
        this.expenses = expenses;
        this.profits = profits;
        this.especifications = especifications;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the income
     */
    public Float getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(Float income) {
        this.income = income;
    }

    /**
     * @return the expenses
     */
    public Float getExpenses() {
        return expenses;
    }

    /**
     * @param expenses the expenses to set
     */
    public void setExpenses(Float expenses) {
        this.expenses = expenses;
    }

    /**
     * @return the profits
     */
    public Float getProfits() {
        return profits;
    }

    /**
     * @param profits the profits to set
     */
    public void setProfits(Float profits) {
        this.profits = profits;
    }

    /**
     * @return the especifications
     */
    public String getEspecifications() {
        return especifications;
    }

    /**
     * @param especifications the especifications to set
     */
    public void setEspecifications(String especifications) {
        this.especifications = especifications;
    }

}
