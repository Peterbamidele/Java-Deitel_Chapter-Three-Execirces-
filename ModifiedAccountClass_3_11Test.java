import java.util.Scanner;

public class ModifiedAccountClass_3_11Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //CREATING AN OBJECT
        ModifiedAccountClass_3_11 Account = new ModifiedAccountClass_3_11(550.00);
        ModifiedAccountClass_3_11 Account2 = new ModifiedAccountClass_3_11(-7.56);

        //display initial Balance of each object
        System.out.printf("your account balance:$%.2f%n",Account.getBalance());
        System.out.printf("your account2 balance:$%.2f%n",Account2.getBalance());
    }

}
