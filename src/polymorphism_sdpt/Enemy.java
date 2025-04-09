package polymorphism_sdpt;

// base class where all subclasses has the properties of this class

public class Enemy {

    String name;
    int hp;

    void dialogue() {
        System.out.println("I am an enemy!");
    }

    void status() {
        System.out.println(name + " has " + hp + " HP.");
    }
}
