public class Invoice {
    /*3.12 ( Invoice Class) Create a class called Invoice that a hardware store might use to represent
    an invoice for an item sold at the store. An Invoice should include four pieces of information as
    instance variables—a part number (type String ), a part description (type String ), a quantity of the
    item being purchased (type int ) and a price per item ( double ). Your class should have a constructor
    that initializes the four instance variables. Provide a set and a get method for each instance variable.
    In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
    multiplies the quantity by the price per item), then returns the amount as a double value. If the
    quantity is not positive, it should be set to 0 . If the price per item is not positive, it should be set to
    0.0 . Write a test app named InvoiceTest that demonstrates class Invoice ’s capabilities.*/

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    // Constructor
    public Invoice(){
        this.partDescription = "none";
        this.partNumber = "none";
        this.quantity = 0;
        this.pricePerItem =0.0;
    }
    //setter method

    //partNumber
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    // set partdescription

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    // set Quanlity

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // set pricePerItem

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    //getter method

    //PartNumber
    public String getPartNumber() {
        return partNumber;
    }

    // get partdescription
    public String getPartDescription() {
        return partDescription;
    }

    //get Quantity

    public int getQuantity() {
        return quantity;
    }
    //  get perPerItem

    public double getPricePerItem() {
        return pricePerItem;
    }

    // get invoice Amount
    public double getInvoiceAmount(){
        return quantity + pricePerItem;

    }
}
