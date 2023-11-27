package pl.programujodpodstaw;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Kamil")
                .age(35)
                .build();
    }
}