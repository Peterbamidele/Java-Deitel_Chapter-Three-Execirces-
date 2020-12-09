import javax.swing.*;

// obtaining a user input

public class NameDialog {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("What is your name?");

        String message = String.format("Welcome, %s, to java Programing!", name);

        JOptionPane.showMessageDialog(null, message);


    }
}
