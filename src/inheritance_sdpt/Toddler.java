package inheritance_sdpt;

public class Toddler extends Person {

    String favoriteGame; // this is an example of a subclass that has its own attributes

    Toddler(String name, String sex, int age, String favoriteGame) {
        super(name, sex, age);
        this.favoriteGame = favoriteGame;
    }

    void drink() {
        System.out.println(name + "Drinking milk");
    }

    void checkStatus() {
        super.checkStatus(); // calling the method from the parent class; method overriding
        System.out.println("Favorite Game: " + favoriteGame);
    }
}
