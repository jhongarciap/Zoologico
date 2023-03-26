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
public class Transation {
    private String code;
    private String name;
    private Float discount;
    private Date date;
    private Float income;
    private Float expenses;
    private Float profits;
    private String especifications;

    public Transation(String code, String name, Float discount, Date date, Float income, Float expenses, Float profits, String especifications) {
        this.code = code;
        this.name = name;
        this.discount = discount;
        this.date = date;
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

   