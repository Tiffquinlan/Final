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
    private Array validSize;

    public Beverage(String drink, String size, String type) {
        super.setName(drink);
        this.size = size;
        this.type = type;

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

    //validSize [s,m,l]; create an array with the valid inputs to check for errors
    //create an additional set and get method for size

    //ValidFlavor [Sprite, rootbeer, and orange fanta]  create an array with the valid inputs to check for errors
    //create an additional set and get method for size

    @Override // override the Food toString to include the size and type in the output
    public String toString() {
        return super.toString()+"\nsize: " + size + "\t\tFlavor " + type +'\n';
    }
}
