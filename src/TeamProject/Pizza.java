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
    private double cost = 5.00;
    private ArrayList<String> toppings;

    public Pizza(String pizza, String size, ArrayList<String> toppings) {
        this.setName(pizza);
        this.size = size;
        this.toppings = toppings;
    }
    public void setSize(String size) {
        /*
         * setSize method
         * Purpose: sets the size of a pizza object
         * @param creates the siz of the pizza
         * @return void
         */
        this.size = size;
    }
    public void setToppings(ArrayList<String> toppings){
        /*
         * setToppings
         * Purpose: sets the toppings for a pizza object
         * @return void
         */
        this.toppings = toppings;
    }
    public String getSize() {
        /*
         * getSize method
         * Purpose: return the size of a pizza object
         * @param return size, as a String
         * @return double
         */
        return size;
    }
    public ArrayList<String> getToppings(){
        /*
         * getToppings
         * Purpose: returns the toppings for a burger object.
         * @return ArrayList (topping)
         */
        return toppings;
    }

    public double getCost() {
            /**
             * setCost method
             * Purpose: to calculate the cost of a pizza object
             * @param calculate the cost, as a double
             * @return void
             */
            double price = 5.00;
            switch (size) {
                case "Small":
                    price = 5.00;
                    break;
                case "Medium":
                    price = 7.50;
                    break;
                case "Large":
                    price = 10.00;
                    break;
            }
            for (String topping : toppings){price = price + 1.00;
            }
      return price;
    }
    public boolean getValidToppings(String topping) {
        /*
         * getValidTopping
         * Purpose: to verify the toppings for a pizza object
         * @param verify topping, returns true if topping found
         * @return boolean
         */

        String[] validToppings = {"Pepperoni", "sausage", "peppers", "chicken", "salami", "tomatoes", "olives", "anchovies"};
        boolean valid = false;
        for (String validTopping : validToppings) {
            if (topping.equals(validTopping)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    @Override // override the Food toString to include the size and toppings in the output
    public String toString() {
        /*
         * the toString method
         * Purpose” to display the Object attributes with help from the super class
         * @param display attributes of an object, as a string
         * @return String
         */
        return String.format(super.toString() + "%nSize: %s \t Toppings:%s %n", size, toppings);
    }
}
