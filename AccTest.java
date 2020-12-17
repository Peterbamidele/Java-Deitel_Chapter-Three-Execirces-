import java.util.Scanner;

public class AccTest {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        Acc myAcc = new Acc();
//
//       System.out.printf("initial name is: %s%n%n",myAcc.getName());
//        System.out.println("Enter Your Name: ");
//
//        String theName = input.nextLine();
//        myAcc.setName(theName);
//        System.out.println();
//        Acc myAcc1 = new Acc("Bamidele");
//        System.out.printf("Name of Object myAcc is : %n%s%n", myAcc.getName());




    //Using the Account constructor to initialize the name instance
    // variable at the time each Account object is created.

        Acc myAcc = new Acc("Bamidele",500.00,2091);
        Acc myAcc1 = new Acc("Oluwatobi", -74.00,2091);


        System.out.printf("%s Balance : $%.2f%n", myAcc.getName(),myAcc.getBalance(),myAcc.getPin());
        System.out.printf("%s Balance: $%.2f%n%n ", myAcc1.getName(),myAcc1.getBalance(),myAcc1.getPin());


        Scanner input = new Scanner(System.in);//


        System.out.print("Enter Amount you want to deposit: $");//prompt user to enter the mount they want to deposit
        double depositAmount= input.nextDouble();
        System.out.printf("%n paid $%.2f to myAcc balance%n%n ", depositAmount);
        myAcc.deposit(depositAmount);


       // display balance
        System.out.printf("%s balance:$%.2f%n", myAcc.getName(),myAcc.getBalance(),myAcc.getPin());
        System.out.printf("%s balance:$%.2f%n", myAcc1.getName(),myAcc1.getBalance(),myAcc1.getPin());




        // prompt user to enter amount for second user
        System.out.printf("Enter Amount you want to deposit in Acc1: $ ");
        depositAmount = input.nextDouble();
        System.out.printf("%n paid $%.2f to myAcc1 balance%n%n", depositAmount);
        myAcc1.deposit(depositAmount);


        // display balance
        System.out.printf("%s balance:$%.2f%n", myAcc.getName(),myAcc.getBalance());
        System.out.printf("%s balance:$%.2f%n", myAcc1.getName(),myAcc1.getBalance());


    }
}
