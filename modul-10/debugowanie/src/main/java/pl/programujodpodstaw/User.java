package pl.programujodpodstaw;

public class User {
    private String name;
    private String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void capitalizeName() {
        name = name.toUpperCase();
    }

    public void capitalizeLastName() {
        lastName = lastName.toUpperCase();
    }

    public boolean isMale() {
        return !name.endsWith("a");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
