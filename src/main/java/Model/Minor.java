package Model;

/**
 *
 * @author garci
 */
public class Minor extends Animal {

    public Minor(String name, String race, String sex, String habitat, String diet) {
        super(name, race, sex, habitat, diet);
    }

    private String diseases;
    private String nativeClimate;

    public Minor(String name, String race, String sex, String habitat, String diseases, String nativeClimate, String diet) {
        super(name, race, sex, habitat, diet);
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
