package inheritance_sdpt;

public class Toddler extends Person {

    String favoriteGame; // this is an example of a subclass that has its own attributes

    Toddler(String name, String sex, int age, String favoriteGame) {
        super(name, sex, age);
        this.favoriteGame = favoriteGame;
    }

    void drink() {
        System.out.println(name + " is Drinking milk");
    }

    void checkStatus() { // if wanted to add more attributes to the checkStatus method, we can method override it
        super.checkStatus();
        System.out.println("Favorite Game: " + favoriteGame);
    }
}
