package polymorphism_sdpt;

public class Weak_Enemy extends Enemy {

    Weak_Enemy() {
        name = "Weak Enemy";
        hp = 10;
    }

    @Override
    void dialogue() {
        System.out.println(name + ": I am a weak enemy!");
    }
}
