public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    // Construtor

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
