/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author garci
 */
public class Minor extends Animal{
    
    public Minor(String name, String race, String sex, String habitad, String diet) {
        super(name, race, sex, habitad, diet);
    }
     
    private String diseases;
    private String nativeClimate;

    public Minor(String diseases, String nativeClimate, String name, String race, String sex, String habitad, String diet) {
        super(name, race, sex, habitad, diet);
        this.diseases = diseases;
        this.nativeClimate = nativeClimate;
    }

    /**
     * @return the diseases
     */
    public String getDiseases() {
        return diseases;
    }

    /**
     * @param diseases the diseases to set
     */
    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    /**
     * @return the nativeClimate
     */
    public String getNativeClimate() {
        return nativeClimate;
    }

    /**
     * @param nativeClimate the nativeClimate to set
     */
    public void setNativeClimate(String nativeClimate) {
        this.nativeClimate = nativeClimate;
    }
    
}
