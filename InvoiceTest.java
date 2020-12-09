import java.util.Scanner;
public class InvoiceTest {
    public static  void main(String [] args){


        Scanner input = new Scanner(System.in);


        // create invoice objects
        Invoice invoiceIssued1 = new Invoice();

        //Get invoice1 details from user
        System.out.println("invoice 1");
        System.out.print("Enter the part number: ");
        Object partNum = input.nextLine();

        System.out.print("Enter the part decscription");
        Object partDescrption = input.nextLine();

        System.out.print("Enter the Quantity: ");
        int qauntity = input.nextInt();

        System.out.print("Enter the price: ");
        double price = input.nextDouble();

        System.out.println("");

        // add invoiceissued1's add
        invoiceIssued1.setpartNumber(partNum);
        invoiceIssued1.setpartDescription(partDescr);



    }
}
