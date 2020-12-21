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
        Invoice invoiceIssued2 = new Invoice();



        //calling the set method
        invoiceIssued.setPartDescription("partDesc");
        invoiceIssued.setPartNumber("partNum");
        invoiceIssued.setQuantity(quantity);
        invoiceIssued.setPricePerItem(price);



        //Get invoice1 details from user
        System.out.println("invoice 1");
        System.out.print("Enter the ReceiptNumber of the Slip: ");
        partNum = input.nextLine();
        invoiceIssued.setPartNumber(partNum);



        System.out.print("Enter the Slip Description: ");
        partDesc = input.nextLine();
        invoiceIssued.setPartDescription(partDesc);

        System.out.print("Enter the Quantity: ");
        quantity = input.nextInt();
        invoiceIssued.setQuantity(quantity);

        System.out.print("Enter the price #: ");
        price = input.nextDouble();
        invoiceIssued.setPricePerItem(price);

        System.out.println("");

        // display form for invoice's data
        System.out.println("Invoice information");
        System.out.println("Serial-Number: " + invoiceIssued.getPartNumber());
        System.out.println("Description: " + invoiceIssued.getPartDescription());
        System.out.println("Quantity: " + invoiceIssued.getQuantity());
        System.out.printf("Invoice Amount: $%.2f",invoiceIssued.getInvoiceAmount());


        //Get invoice2  details from SecondUser
        System.out.println("invoice 2");
        System.out.print("Enter the ReceiptNumber of the Slip: ");
        partNum = input.nextLine();
        invoiceIssued2.setPartNumber(partNum);



        System.out.print("Enter the Slip-Product description: ");
        partDesc = input.nextLine();
        invoiceIssued2.setPartDescription(partDesc);

        System.out.print("Enter the Quantity: ");
        quantity = input.nextInt();
        invoiceIssued2.setQuantity(quantity);

        System.out.print("Enter the price #: ");
        price = input.nextDouble();
        invoiceIssued2.setPricePerItem(price);

        System.out.println("");

        // display form for invoice's data
        System.out.println("Invoice information");
        System.out.println("Part Number: " + invoiceIssued2.getPartNumber());
        System.out.println("Description: " + invoiceIssued2.getPartDescription());
        System.out.println("Quantity: " + invoiceIssued2.getQuantity());
        System.out.printf("Invoice Amount: $%.2f",invoiceIssued2.getInvoiceAmount());






    }
}
