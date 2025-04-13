package abstraction2_sdpt;

public class Frog implements Animal, WaterAnimal, LandAnimal {
    @Override
    public void makeSound() {
        System.out.println("Kokak!");
    }

    @Override
    public void swim() {
        System.out.println("Frog is swimming in the water.");
    }

    @Override
    public void walk() {
        System.out.println("Frog is walking on land.");
    }
}
