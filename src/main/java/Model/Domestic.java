/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author garci
 */
public class Domestic extends Animal{
    
    private String psyche;
    private String origin;

    public Domestic(String name, String race, String sex, String habitat, String origin, String psyche, String diet) {
        super(name, race, sex, habitat, diet);
        this.psyche = psyche;
        this.origin = origin;
    }

    /**
     * @return the psyche
     */
    public String getPsyche() {
        return psyche;
    }

    /**
     * @param psyche the psyche to set
     */
    public void setPsyche(String psyche) {
        this.psyche = psyche;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    
    
    
}
