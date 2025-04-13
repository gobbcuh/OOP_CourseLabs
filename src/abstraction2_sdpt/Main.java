package abstraction2_sdpt;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Frog frog = new Frog();

        dog.makeSound();
        dog.walk();
        bird.makeSound();
        bird.fly();
        bird.walk();
        frog.makeSound();
        frog.swim();
        frog.walk();
    }
}
