package laboratory4_4;

public class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass.");
    }

    @Override
    void sleep() {
        System.out.println("Deer sleeps in the forest.");
    }
}
