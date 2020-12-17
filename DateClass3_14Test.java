import java.util.Scanner;

public class DateClass3_14Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        DateClass3_14 date = new DateClass3_14(0,0,0);


        System.out.println("Enter Month");
        int month = input.nextInt();
        date.setMonth(month);

//        System.out.println("Enter Day ");
//        int date =input.nextInt();
//        date.setday(date);
//
//        System.out.println("Enter Year");
//        int year =input.nextInt();
//        date.setyear(year);
//
//        date.displayDate();


    }

}

