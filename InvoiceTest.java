import java.util.Scanner;
public class InvoiceTest {
    public static  void main(String [] args){


        Scanner input = new Scanner(System.in);
        String partDesc;
        String partNum;
        int quantity = 0;
        double price = 0.0;



        // create invoice objects
        Invoice invoiceIssued = new Invoice();


        //calling the set method
        invoiceIssued.setPartDescription("partDesc");
        invoiceIssued.setPartNumber("partNum");
        invoiceIssued.setQuantity(quantity);
        invoiceIssued.setPricePerItem(price);



        //Get invoice1 details from user
        System.out.println("invoice 1");
        System.out.print("Enter the part number: ");
        partNum = input.nextLine();

        System.out.print("Enter the part description: ");
        partDesc = input.nextLine();

        System.out.print("Enter the Quantity: ");
        quantity = input.nextInt();

        System.out.print("Enter the price #: ");
        price = input.nextDouble();

        System.out.println("");

        // display form for invoice's data
        System.out.println("Invoice information");
        System.out.println("Part Number" + invoiceIssued.getPartNumber());
        System.out.println("Description" + invoiceIssued.getPartDescription());
        System.out.println("Quantity" + invoiceIssued.getQuantity());
        System.out.printf("Invoice Amount: $%.2f",invoiceIssued.getInvoiceAmount());






    }
}
