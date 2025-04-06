package inheritance_sdpt;

public class Toddler extends Person {

    Toddler(String name, String sex, int age) {
        super(name, sex, age);
    }

    void drink() {
        System.out.println("Drinking milk");
    }
}
