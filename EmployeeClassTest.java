public class EmployeeClassTest {
    public static void main(String [] args){
        EmployeeClass employee1 = new EmployeeClass("bamidele",2091,"IT","Programmer");
        EmployeeClass employee2 = new EmployeeClass("chubizor", 0001,"SoftwareEngineer","Md");
        EmployeeClass employee3 = new EmployeeClass( "tobi", 0003, "Accounting","Level1");

        // set the for employee 1

        employee1.setName( "bamidele" );
        employee1.setIdNumber( 2091 );
        employee1.setDepartment( "IT" );
        employee1.setPosition( "Programmer" );

        //set for employee2
        employee2.setName("chibuzor");
        employee2.getIdNumber(0001);
        employee2.setDepartment( "Software Engineer" );
        employee2.setPosition( "Md" );

       // Set for employee3
        employee3.setName("tobi");
        employee3.getIdNumber(0003);
        employee3.getDepartment("Accounting");
        employee3.getPosition("level1");




        System.out.println("Name\t\tId Number\t\tDepartment\t\tPosition");
        System.out.println(employee1.getName() + "\t" + employee1.getIdNumber(0003) + "\t\t" + employee1.getDepartment("Accounting") + "\t\t\t" + employee1.getPosition("level1"));

        System.out.println("Name\t\tId Number\t\tDepartment\t\tPosition");
        System.out.println(employee2.getName() + "\t\t" + employee2.getIdNumber(0003) + "\t\t" + employee2.getDepartment("Accounting") + "\t\t\t" + employee2.getPosition("level1"));

        System.out.println("Name\t\tId Number\t\tDepartment\t\tPosition");
        System.out.println(employee3.getName() + "\t\t" + employee3.getIdNumber(0003) + "\t\t\t" + employee3.getDepartment("Accounting") + "\t\t\t" + employee1.getPosition("level1"));

    }
}
