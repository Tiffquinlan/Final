package TeamProject;

public class Beverage extends Food {
 // inherits form Food class
    private String size = "s";

    public double setCost() {
    if(size.equals("s")){
        super.setCost(3.00);
    } else if(size.equals("m")){
        super.setCost(3.50);
    } else if(size.equals("l")){
        super.setCost(4.00);
    }
      return super.getCost();
    }



    //validSize [s,m,l]; create an array with the valid inputs to check for errors
    //create an additional set and get method for size

    //ValidFlavor [Sprite, rootbeer, and orange fanta]  create an array with the valid inputs to check for errors
    //create an additional set and get method for size

    @Override // override the Food toString to include the size in the output
    public String toString() {
        return super.toString();
    }
}
