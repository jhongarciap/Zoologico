package Model;

/**
 *
 * @author garci
 */
public class Supply {
    private String name;
    private String type;
    private String animal;
    private String specifications;
    private String quantity;

    public Supply(String type, String name, String animal, String quantity, String specifications) {
        this.name = name;
        this.type = type;
        this.animal = animal;
        this.specifications = specifications;
        this.quantity = quantity;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the animal
     */
    public String getAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    /**
     * @return the specifications
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * @param specifications the specifications to set
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
}
