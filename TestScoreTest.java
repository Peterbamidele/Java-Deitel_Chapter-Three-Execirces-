import java.util.Scanner;

public class TestScoreTest {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        TestScore result = new TestScore();

        double userscore1;
        double userscore2;
        double userscore3;

        System.out.println("please enter score 1: ");
        userscore1 =input.nextInt();

        System.out.println("please enter score 2: ");
        userscore2 =input.nextInt();

        System.out.println("please enter score 3: ");
        userscore3 =input.nextInt();

        result.setScore1( userscore1);
        result.setScore2(userscore2);
        result.setScore3(userscore3);
        result.calculateAverage();
        System.out.printf("The average of the %.1f, %.1f and %.1f is %.1f ", result.getScore1(), result.getScore2(), result.getScore3(),
                result.calculateAverage());


    }

}


