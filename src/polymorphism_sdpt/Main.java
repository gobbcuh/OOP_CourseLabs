package polymorphism_sdpt;

public class Main {
    public static void main(String[] args) {
        
        // Animal a = new Dog(); // Polymorphism: Animal reference but Dog object
        // Animal b = new Cat();

        // a.makeSound();
        // b.makeSound();

        Enemy enemy1 = new Weak_Enemy();    // Polymorphism: Enemy reference but Weak_Enemy object
        Enemy enemy2 = new Strong_Enemy();
    }
}