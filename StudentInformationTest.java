public class StudentInformationTest {
    public static void main(String[] args) {
        StudentInformation pupil = new StudentInformation(9999,12,3);

        pupil.setStudentID(1234);
        pupil.setNumOfPoints(47);
        pupil.setCreditHours(15);

        pupil.showStudentID();
        pupil.showNumberOfPoint();
        pupil.showSCreditHours();

        System.out.println("GPA = " + pupil.getGradePoint());

    }

}
