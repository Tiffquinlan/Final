package TeamProject;
import java.sql.Array;
import java.util.ArrayList;

/**
 * Burger Class
 * Purpose” creates an object burger that inherits from Food class.
 * constructs a burger w/ toppings and cost
 */


public class Burger extends Food {
    // inherits form Food class
    private double cost = 3.00;
    private ArrayList<String> toppings;
    private Array validToppings;

    public Burger(String burger, ArrayList<String> toppings) {
        super.setName(burger);
        this.toppings = toppings;
    }

    public void setToppings(ArrayList<String> toppings){
        /*
          setToppings
          Purpose: adds a topping to the burger object.
         */
        this.toppings = toppings;
    }
    public ArrayList<String> getToppings(){
        /*
         * getToppings method
         * Purpose: returns the toppings for a burger object.
         * @return Array (toppings)
         */
        return toppings;
    }
    @Override
    public void setCost() {
        /*
         * setCost method
         * Purpose: to calculate the cost of a burger object
         * @param calculate the cost, as a double
         * @return void
         */
        double price = 5.00;
        for (String topping : toppings) price = +.50;
        super.setCost();
    }
    public double getCost() {
        /*
         * getCost method
         * Purpose: to return the cost of a burger object
         * @param return cost, as a double
         * @return double
         */
        double price = 5.00;
        for (String topping : toppings) price = price +.50;
        super.setCost();
        return price;
    }
    public boolean getValidToppings(String topping) {
        /*
         * getValidTopping
         * Purpose: to verify the toppings for a burger object
         * @param verify topping, returns true if topping found
         * @return boolean
         */

        String[] validToppings = {"Patty", "bacon", "cheese", "lettuce", "tomato", "pickles", "onions"};
        boolean valid = false;
        for (String validTopping : validToppings) {
            if (topping.equals(validTopping)) {
                valid = true;
                break;
            }
        }
        return valid;
    }


    @Override // override the Food toString to include the toppings in the output
    public String toString() {
        /**
         * the toString method
         * Purpose” to display the Object attributes with help from the super class
         * @param display attributes of an object, as a string
         * @return String
         */
        return String.format(super.toString() + "%nToppings:%s %n",  toppings);

    }

}
