import java.util.Scanner;

public class ExerciseExample3Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ExerciseExample3 myExerciseExample3 = new ExerciseExample3();

        System.out.printf("initial name is: %s%n%n", ExerciseExample3.getName());

        System.out.println("Please enter your name :");

        String theName = input.nextLine();

        myExerciseExample3.setName(theName);
        System.out.println();

        System.out.printf("Name on object ExerciseExample3: %s%n%n", myExerciseExample3.getName());

    }
}
