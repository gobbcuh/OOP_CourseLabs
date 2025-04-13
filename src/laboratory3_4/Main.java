package laboratory3_4;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee programmer = new Programmer();

        manager.calculateSalary();
        programmer.calculateSalary();
    }
}
