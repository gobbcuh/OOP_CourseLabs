package abstraction2_sdpt;

public class Dog implements Animal, LandAnimal {
    @Override
    public void makeSound() {
        System.out.println("Arf!");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking on land.");
    }
}