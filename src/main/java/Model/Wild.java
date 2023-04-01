/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Animal;

/**
 *
 * @author garci
 */
public class Wild extends Animal{
    
    public Wild(String name, String race, String sex, String habitad, String diet) {
        super(name, race, sex, habitad, diet);
    }
    private String birthhabitat;
    private String dangerousness;

    public Wild(String birthhabitat, String dangerousness, String name, String race, String sex, String habitad, String diet) {
        super(name, race, sex, habitad, diet);
        this.birthhabitat = birthhabitat;
        this.dangerousness = dangerousness;
    }

    /**
     * @return the birthhabitat
     */
    public String getBirthhabitat() {
        return birthhabitat;
    }

    /**
     * @param birthhabitat the birthhabitat to set
     */
    public void setBirthhabitat(String birthhabitat) {
        this.birthhabitat = birthhabitat;
    }

    /**
     * @return the dangerousness
     */
    public String getDangerousness() {
        return dangerousness;
    }

    /**
     * @param dangerousness the dangerousness to set
     */
    public void setDangerousness(String dangerousness) {
        this.dangerousness = dangerousness;
    }
    
    
}
