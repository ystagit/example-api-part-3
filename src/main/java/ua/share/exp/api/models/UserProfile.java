package ua.share.exp.api.models;

public class UserProfile {

    private final String firstName;

    private final int age;

    private final boolean male;

    public UserProfile(String firstName, int age, boolean male) {
        this.firstName = firstName;
        this.age = age;
        this.male = male;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public boolean getMale() {
        return male;
    }
}
