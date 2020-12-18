public class Sandwich {
    /*
    a. Create a class name sandwich.Data fields include a String for the main ingredient(such as *tuna*), a String for bread type(such as *wheat*),
    and a double for price(such as 4.99). Include methods to get and set values for each of these fields.Save the class as Sandwich.java*
    b. Create an application name TestSandwich that instantiates one Sandwich object and demonstrates the use of the set and get methods.
    Save this application as TestSandwich.java*/

    private String mainIngredient;
    private  String breadType;
    private double price;


    // getter and setter methods

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
