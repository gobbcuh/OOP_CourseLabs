package inheritance_sdpt;

public class Main {
    public static void main (String[] args) {

        Person per = new Person("Pandesal", "Male", 1);
        Toddler tod = new Toddler("Mocha", "Female", 1);

        per.checkStatus();
        tod.checkStatus(); // toddler object can access/inherits methods from Person class even without declaring it in the toddler class
        tod.drink();
    }
}
