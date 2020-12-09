public class Account {

    public String name;
    private double balance;


    // constrator
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }


    // method set for
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    // set method for name

    public void setName(String name) {
        this.name = name;
    }
    // getter method for name

    public String getName() {
        return name;
    }

}

