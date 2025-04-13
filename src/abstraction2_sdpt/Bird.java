package abstraction2_sdpt;

public class Bird implements Animal, AirAnimal, LandAnimal {
    @Override
    public void makeSound() {
        System.out.println("Twit!");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying in the air.");
    }

    @Override
    public void walk() {
        System.out.println("Bird is walking on land.");
    }
}
