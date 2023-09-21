package pl.programujodpodstaw.example;

public class User {
    String name;
    int age;
    boolean isActive;
    String email;

    public User() {}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.isActive = true;
    }

    public User(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public User(String name, int age, boolean isActive, String email) {
        this(name, age, isActive);
        this.email = email;
    }

    public User(String name) {
        this.name = name;
        this.isActive = true;
    }

    public void hello() {
        System.out.println("Hello!");
    }

    public void printUserInformation() {
        System.out.println("Imię: " + name);
        System.out.println("Wiek: " + age);
        System.out.println("Czy aktywny: " + isActive);
        System.out.println("Czy może kupować: " + canBuyProduct());
    }

    public boolean canBuyProduct() {
        return age >= 18;
    }

    public void sendEmail(String body) {
        System.out.println("Wysyłam maila o treści " + body + " na " +
                "adres " + this.email);
    }

    public boolean sendEmail(String body, String subject) {
        System.out.println("Wysyłam maila o treści " + body + " i temacie " +
                        subject + " na " + "adres " + this.email);

        return true;
    }
}
