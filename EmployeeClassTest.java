import java.util.Scanner;
public class EmployeeClassTest {
    public static void main(String [] args){
        EmployeeClass employee1 = new EmployeeClass();
        EmployeeClass employee2 = new EmployeeClass("peter ", 2901);
        EmployeeClass employee3 = new EmployeeClass( "tobi", 2091, "Manufacturing","Level1");

        // set the for employee 1

        employee1.setName( "bamidele" );
        employee1.setIdNumber( 2091 );
        employee1.setDepartment( "IT" );
        employee1.setPosition( "Programmer" );

        //set for employee2
        employee2.setDepartment( "Acounting" );
        employee2.setPosition( "Md" );




        System.out.println("Name\t\tId Number\t\tDepartment\t\tPosition");
        System.out.println(employee1.getName() + "\t" + employee1.getIdNumber() + "\t\t" + employee1.getDepartment() + "\t\t\t" + employee1.getPosition());

        System.out.println("Name\t\tId Number\t\tDepartment\t\tPosition");
        System.out.println(employee2.getName() + "\t\t" + employee2.getIdNumber() + "\t\t" + employee2.getDepartment() + "\t\t\t" + employee2.getPosition());

        System.out.println("Name\t\tId Number\t\tDepartment\t\tPosition");
        System.out.println(employee3.getName() + "\t\t" + employee3.getIdNumber() + "\t" + employee3.getDepartment() + "\t\t\t" + employee1.getPosition());

    }
}
