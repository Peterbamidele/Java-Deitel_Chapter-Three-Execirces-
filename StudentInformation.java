public class StudentInformation {
/*
A. Create a class named Student. A student has field for an ID number, number of credit hours earned,and
number of point earned(for example, many schools compute grade point average based on scale of 4, so a three-credit-hour class
in which a student earns an A is worth 12 points.)Include methods to assign values to all fields.A student also has a field for
grade point average.Include a method to compute the grade point average field by dividing points by credit hours earned.
Write methods to display the values in each Student fields.Save this class as Student.java

B. Write a class named ShowStudent that instantiates a Student object from the class you created and assign values to its fields.
Compute the Student grade point average and then display all the values associated with the student.Save the application as
ShowStudent.java

C. Create a constructor for the Student class created. The constructor should initialize each Student ID number to 9999,his or her
 point earned to 12, and credit hours to 3(resulting in a grade pont average of 4.0). Write a program that demonstrate that thr constructor
 work by instantiating an object and displaying the initial values.Save the application as ShowStudent2.java*/
private int studentID;
private int creditHours;
private  int numOfPoints;


    public StudentInformation(int studentID, int creditHours, int numOfPoints) {
        this.studentID = 9999;
        this.creditHours = 12;
        this.numOfPoints = 3;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getNumOfPoints() {
        return numOfPoints;
    }

    public void setNumOfPoints(int numOfPoints) {
        this.numOfPoints = numOfPoints;
    }
    public  double getGradePoint(){
        return (numOfPoints / creditHours);
    }
    public  void showStudentID(){
        System.out.println("Student ID: " + studentID);
    }
    public  void showSCreditHours(){
        System.out.println("Credit Hours: " + creditHours);
    }
    public  void showNumberOfPoint(){
        System.out.println("Grade Point: " + numOfPoints);
    }
}
