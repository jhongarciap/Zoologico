/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zoosantafe.zoologico;

/**
 *
 * @author juan.castro17
 */
public class Planes {
    private int code;
    private String name;
    private String Time;
    private String description;
    private String day;
    private String hours;
    private String worth;
    private int personsAmount;
    private double wortheventsubscription;
    private double adultTicketValue;
    private double kidTicketValue;
    private String souvenir;

    public Planes() {
    }

    public Planes(int code, String name, String Time, String description, String day, String hours, String worth, int personsAmount, double wortheventsubscription, double adultTicketValue, double kidTicketValue, String souvenir) {
        this.code = code;
        this.name = name;
        this.Time = Time;
        this.description = description;
        this.day = day;
        this.hours = hours;
        this.worth = worth;
        this.personsAmount = personsAmount;
        this.wortheventsubscription = wortheventsubscription;
        this.adultTicketValue = adultTicketValue;
        this.kidTicketValue = kidTicketValue;
        this.souvenir = souvenir;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
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
     * @return the Time
     */
    public String getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the hours
     */
    public String getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(String hours) {
        this.hours = hours;
    }

    /**
     * @return the worth
     */
    public String getWorth() {
        return worth;
    }

    /**
     * @param worth the worth to set
     */
    public void setWorth(String worth) {
        this.worth = worth;
    }

    /**
     * @return the personsAmount
     */
    public int getPersonsAmount() {
        return personsAmount;
    }

    /**
     * @param personsAmount the personsAmount to set
     */
    public void setPersonsAmount(int personsAmount) {
        this.personsAmount = personsAmount;
    }

    /**
     * @return the wortheventsubscription
     */
    public double getWortheventsubscription() {
        return wortheventsubscription;
    }

    /**
     * @param wortheventsubscription the wortheventsubscription to set
     */
    public void setWortheventsubscription(double wortheventsubscription) {
        this.wortheventsubscription = wortheventsubscription;
    }

    /**
     * @return the adultTicketValue
     */
    public double getAdultTicketValue() {
        return adultTicketValue;
    }

    /**
     * @param adultTicketValue the adultTicketValue to set
     */
    public void setAdultTicketValue(double adultTicketValue) {
        this.adultTicketValue = adultTicketValue;
    }

    /**
     * @return the kidTicketValue
     */
    public double getKidTicketValue() {
        return kidTicketValue;
    }

    /**
     * @param kidTicketValue the kidTicketValue to set
     */
    public void setKidTicketValue(double kidTicketValue) {
        this.kidTicketValue = kidTicketValue;
    }

    /**
     * @return the souvenir
     */
    public String getSouvenir() {
        return souvenir;
    }

    /**
     * @param souvenir the souvenir to set
     */
    public void setSouvenir(String souvenir) {
        this.souvenir = souvenir;
    }

    @Override
    public String toString() {
        return "Planes{" + "code=" + code + ", name=" + name + ", Time=" + Time + ", description=" + description + ", day=" + day + ", hours=" + hours + ", worth=" + worth + ", personsAmount=" + personsAmount + ", wortheventsubscription=" + wortheventsubscription + ", adultTicketValue=" + adultTicketValue + ", kidTicketValue=" + kidTicketValue + ", souvenir=" + souvenir + '}';
    }
    
    
    
}
