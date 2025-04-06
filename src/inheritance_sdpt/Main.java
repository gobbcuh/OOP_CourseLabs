package inheritance_sdpt;

public class Main {
    public static void main (String[] args) {

        Person per = new Person();
        Toddler tod = new Toddler();

        per.name = "Pandesal";
        per.sex = "Male";
        per.age = 2;

        tod.name = "Mocha"; // toddler object can access/inherits attributes from Person class even without declaring it in the toddler class
        tod.sex = "Female";
        tod.age = 2;

        per.checkStatus();
        tod.checkStatus(); // toddler object can access/inherits methods from Person class even without declaring it in the toddler class
    }
}
