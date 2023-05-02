/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author garci
 */
public class Wild extends Animal{
    
    public Wild(String name, String race, String sex, String habitat, String diet) {
        super(name, race, sex, habitat, diet);
    }
    private String birthhabitat;
    private String dangerousness;

    public Wild(String name, String race, String sex, String habitat, String birthhabitat, String dangerousness, String diet) {
        super(name, race, sex, habitat, diet);
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
