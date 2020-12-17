public class StudentTest {
    public static void main(String[] args) {

        Student input = new Student("bamidele",4,45);

//        input.age = 1;
//        input.name = "peter";
//        input.id = 2;
//
//        System.out.println(input.name + " is " + input.age + " years old " );
        input.setId(4);
        input.setAge(45);
        input.setName("bamidele");

        System.out.println(input.getName() + " is " +  input.getAge()  + " years old " +  input.getId());

    }
}
