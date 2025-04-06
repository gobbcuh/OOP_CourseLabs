package encapsulation_sdpt;

public class User {
    
    private int userID;
    private String username, firstName, lastName;

    User (int userID, String username, String firstName, String lastName) {
        this.userID = userID;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void setUserID(int userID) {
        this.userID = userID;
    }

    void setUsername(String username) {
        this.username = username;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    int getUserID() {
        return userID;
    }

    String getUsername() {
        return username;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}
