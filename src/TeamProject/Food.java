package TeamProject;

public class Food {

    private String name = "food item";
    private double cost = 1;
    private int quantity = 1;
    private java.util.Date dateCreated;

    /** Construct a default Food object */
    public Food() {dateCreated = new java.util.Date();
    }

    /** Construct of a Food object with the specified name
     *  cost and quantity*/
    public Food(String name, double cost, int quantity) {
        dateCreated = new java.util.Date();
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }
    /** Return  name*/
    public String getName(){
        return name;
    }

    /** Return  cost*/
    public double getCost(){return cost;}

    /** Return  quantity*/
    public int getQuantity(){ return quantity;}

    /** sets the name of Food item*/
    public setName(name String){

    }

    /** sets the cost of Food item*/
    public setCost(cost double){

    }

    /** sets the quantity of Food item*/
    setQuantity(quantity int){

    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\nname: " + name +
                " and cost: " + cost;
    }

}
