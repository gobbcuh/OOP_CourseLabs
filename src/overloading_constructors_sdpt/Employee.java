package overloading_constructors_sdpt;

public class Employee {
    
    private String firstName, lastName, title, address, sex;
    private int age;

    Employee(String firstName, String lastName, String title, String address, String sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    Employee(String firsName, String lastName, String title) { // overloading constructor; only takes the essential info; taga-salo if may kulang na info based sa unang constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }
}
