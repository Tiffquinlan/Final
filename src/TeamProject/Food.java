package TeamProject;
/**
 * Food
 * Purpose” creates a Food object.
 * constructs the name, cost, and quantity for a Food object.
 */
public class Food {

    private String name = "food item";
    private double cost = 0.00;


    /** Construct a default Food object */
    public Food() {
    }

    /** Construct of a Food object with the specified name
     *  cost and quantity*/
    public Food(String name) {
        this.name = name;
    }
    /** sets the name of Food item*/
    public void setName(String name) {
    this.name = name;
    }

    /** sets the cost of Food item*/
    public void setCost() {
    this.cost = cost;
    }

    /** Return  name*/
    public String getName(){
        return name;
    }

    /** Return  cost*/
    public double getCost(){
        return cost;
    }


    /** Return a string representation of this object */
    public String toString() {
        return  "\nItem: " + name +
                "\t\tCost: " + getCost();
    }

}
