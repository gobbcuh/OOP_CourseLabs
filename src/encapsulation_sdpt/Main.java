package encapsulation_sdpt;

public class Main {
    public static void main(String[] args) {

        User u = new User(0, null, null, null);

        u.setUserID(488);
        u.setUsername("gobbcuh");
        u.setFirstName("Pandesal");
        u.setLastName("Mocha");

        System.out.println("User ID: " + u.getUserID());
        System.out.println("Username: " + u.getUsername());
        System.out.println("First Name: " + u.getFirstName());
        System.out.println("Last Name: " + u.getLastName());
    }
}