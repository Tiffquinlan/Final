package TeamProject;
import java.sql.Array;
import java.util.ArrayList;
/**
 * Pizza
 * Purpose” creates an object pizza that inherits from Food class.
 * constructs a pizza w/ size, toppings and cost.
 */

public class Pizza extends Food {
    // inherits form Food class
    private String size = "s";
    private ArrayList<String> toppings;
    private Array validToppings;
    //validSize [s,m,l]; create an array with the valid inputs to check for errors
    //create an additional set and get method for size
    private String topping = "n";

    public Pizza(String pizza, String size, ArrayList<String> toppings) {
        this.setName(pizza);
        this.toppings = toppings;
    }

    //validToppings [Pepperoni, sausage, peppers, chicken, salami, tomatoes, olives, anchovies ]; create an array with the valid inputs to check for errors
    //create an additional set and get method for size
    public void setToppings(String topping){
        // add topping to the Pizza's toppings
    }
    public void setSize(String size) {
        this.size = size;
    }
    public ArrayList<String> getToppings(){
        /**
         * getToppings
         * Purpose: returns the toppings for a burger object.
         * @return ArrayList (topping)
         */
        return toppings;
    }
    public String getSize() {
        return size;
    }

    public double getCost(String size) {
        double price = 1;
        switch (size) {
            case "Small":
                price =5.00;
                break;
            case "Medium":
                price = 7.50;
                break;
            case "Large":
                price = 10.00;
                break;
        }
        for (String topping : toppings) price = + 1.00;
        super.setCost(price);
        return price;
    }

    @Override // override the Food toString to include the size and toppings in the output
    public String toString() {
        return super.toString() + "\nsize: " + size + "\t\t w/" + toppings +"\n";
    }
}
