package overloading_constructors_sdpt;

public class Employee {
    
    // encapsulation; private access modifier; only accessible within the class
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

    Employee() {
        this.firstName = "N/A";
        this.lastName = "N/A";
        this.title = "N/A";
        this.address = "N/A";
        this.sex = "N/A";
        int age = 0;
    }

    String getFirstName(String firstName) {
        return firstName;
    }

    String getLastName(String lastName) {
        return lastName;
    }

    String getTitle(String title) {
        return title;
    }

    String getAddress(String address) {
        return address;
    }

    String getSex(String sex) {
        return sex;
    }

    int getAge(int age) {
        return age;
    }
}
