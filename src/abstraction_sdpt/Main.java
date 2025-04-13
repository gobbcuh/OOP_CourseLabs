package abstraction_sdpt;

public class Main {
    public static void main(String[] args) {
        // abstract idea
        // Animal animal = new Animal(); useless, cannot create an instance of an abstract class

        // concrete idea
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}