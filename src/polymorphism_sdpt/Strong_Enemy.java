package polymorphism_sdpt;

public class Strong_Enemy extends Enemy {

    Strong_Enemy() {
        name = "Strong Enemy";
        hp = 100;
    }

    @Override
    void dialogue() {
        System.out.println(name + ": I am a strong enemy!");
    }
}
