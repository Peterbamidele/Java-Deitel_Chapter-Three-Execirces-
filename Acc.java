public class Acc {
    private String name;
    private double balance;
    private int pin;


    public Acc(String name, double balance, int pin) { // constructor
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
        this.pin = pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    // method for deposit that add valid amount to balance to amount
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            this.balance = balance + depositAmount;
    }

    // method that return balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getPin() {

        return pin;
    }

    public void setPin(int newpin, int oldpin) {
        if (pin == oldpin) {
            pin = newpin;
        }
        else {
            System.out.printf("wrong pin");
        }
    }
}
