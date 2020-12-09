import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){

        Account account1 = new Account("peter", 700.00);
        Account account2 = new Account("josh", 200.00);


        // display initial balance of each object
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());


        // create scanner to obtain input from user
        Scanner input = new Scanner(System.in);

//prompt for user1
        System.out.print("enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nCredited %2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        //display balance
        System.out.printf("%s balance $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance $%.2f%n", account1.getName(), account1.getBalance());

//user 2
        //prompt for user 2
        //for amount and balannce
        System.out.print("enter deposit amount for user 2");
        depositAmount = input.nextDouble();
        System.out.printf("%nCrediting $%.2f to account2 balance%n%n", depositAmount);

        //display balance for both account
        System.out.printf("%s balance: $%.2f%n ", account1.getName(), account1.getBalance());
        System.out.printf("%S balance: $%.2f%n", account2.getName(), account2.getBalance());






   }
}
