package TeamProject;
import java.sql.Array;
import java.util.ArrayList;
/**
 * Beverage
 * Purpose” creates an object beverage that inherits from Food class.
 * constructs a beverage w/ size, flavor and cost.
 */

public class Beverage extends Food {
 // inherits form Food class
    private String size = "s";
    private String type;
    private Array validType;

    public Beverage(String drink, String size, String type) {
        super.setName(drink);
        this.size = size;
        this.type = type;
    }

    public void setSize(String size) {
        /*
         * getSize method
         * Purpose: return the size of a pizza object
         * @param return size, as a String
         * @return double
         */
        this.size = size;
    }
    public void setType(String type) {
        /*
         * setType
         * Purpose: sets the the type or flavor of a drink
         * @return void
         */
        this.type = type;
    }
    public String getSize() {
        /*
         * getSize
         * Purpose: returns the size of a drink
         * @return String
         */
        return size;
    }
    public String getType() {
        /*
         * getType
         * Purpose: returns the type or flavor of a drink
         * @return String
         */
        return type;
    }
    public double getCost() {
        double price = 1;
        switch (size) {
            case "Small":
                setCost(5.50);
                break;
            case "Medium":
                setCost(6.00);
                break;
            case "Large":
                setCost(6.50);
                break;
        }
        super.setCost(price);
        return price;
    }
    public boolean getValidType(String type) {
        /*
         * getValidType
         * Purpose: to verify the type or flavor of the beverage
         * @param verify type, returns true if type found
         * @return boolean
         */

        String[] validType = {"Sprite", "rootbeer", "orange fanta"};
        boolean valid = false;
        for (String Type : validType) {
            if (type.equals(validType)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    @Override
    public String toString() {
        /*
         * the toString method
         * Purpose” to display the Object attributes with help from the super class
         * @param display attributes of an object, as a string
         * @return String
         */
        return super.toString()+"\nsize: " + size + "\t\tFlavor " + type +'\n';
    }
}
