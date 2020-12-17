public class ModifiedAccountClass_3_11 {
    /*(Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw
    that withdraws money from an Account . Ensure that the withdrawal amount does not exceed
    the Account ’s balance. If it does, the balance should be left unchanged and the method should print
    a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest(Fig. 3.9) to test method withdraw.*/

    private double balance;

// constructor
    public ModifiedAccountClass_3_11(double initialBalance) {
        if(initialBalance> 0.0)
        this.balance = balance;
    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
    //credit add an amount to the account
    public void credit(double amount){
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double amount){
        if(amount > balance)
            System.out.println("Debit amount exceeded amount balance");
        else
            balance = balance - amount;
    }
}




