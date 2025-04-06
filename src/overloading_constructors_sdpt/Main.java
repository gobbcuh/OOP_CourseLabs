package overloading_constructors_sdpt;

public class Main {
    public static void main(String[] args) {

        Employee worker = new Employee(null, null, null, null, null, 0);
        Employee worker1 = new Employee("Jasmin", "Lorino", "Senior Software Engineer");
        Employee worker2 = new Employee();

        System.out.println(worker2.getAge(0));
    }
    
}
