/*
Write a class named Employee that has the following fields:

•  name. The name field references a String object that holds the employee’s name.
•  idNumber. The idNumber is an int variable that holds the employee’s ID number.
•  department. The department field references a String object that holds the name of the department where the employee works.
•  position. The position field references a String object that holds the employee’s job title.

class have the following constructors:

•  A constructor that accepts the following values as arguments and assigns them to the appropriate fields: employee’s name, employee’s ID number, department, and position.
•  A constructor that accepts the following values as arguments and assigns them to the appropriate fields: employee’s name and ID number. The department and position fields should be assigned an empty string ("").
•  A no-arg constructor that assigns empty strings ("") to the name, department, and position fields, and 0 to the idNumber field.

Write appropriate mutator methods that store values in these fields and accessor methods that return the values in these fields. Once you have written the class, write a separate program that creates three Employee objects to hold the following data:

Name           ID Number       Department           Position
Susan Meyers   47899           Accounting           Vice President
Mark Jones     39119           IT                   Programmer
Joy Rogers     81774           Manufacturing        Engineer

The program should store this data in the three objects and then display the data for each employee on the screen
*/
public class EmployeeClass{
    private String name;
    private int idNumber;
    private  String department;
    private String position;

    // construtor
    public EmployeeClass(String employeeName, int employeeIdNumber, String employeeDepartment, String employeePosition ){
       this.name = employeeName;
        this.idNumber = employeeIdNumber;
        this.department = employeeDepartment;
        this.position = employeePosition;
    }
    public EmployeeClass(String employeeName, int employeeIdNumber){
        this.name = employeeName;
        this.idNumber = employeeIdNumber;
        this.department = "";
        this.position = "";
    }

    public EmployeeClass(){
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    //setter method
    //name

    public void setName(String nameGiven) {
        this.name = nameGiven;
    }

    //idnumber

    public void setIdNumber(int idNumberGiven) {
        this.idNumber = idNumberGiven;
    }
        //idnumber to set int to string
    public void setIdNumber(String idNumberGiven) {
        idNumber = Integer.parseInt(idNumberGiven);
    }
        //department
    public void setDepartment(String departmentGiven) {
        this.department = department;
    }
            //position
    public void setPosition(String positionGiven) {
        this.position = position;
    }
    //getter method

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
}
