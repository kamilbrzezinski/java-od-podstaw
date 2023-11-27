package pl.programujodpodstaw.springbootapp2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    @Value("localhost")
    String host;

    @Value("kamil")
    String username;

    @Value("password")
    String password;

    public void addUserToDatabase(String username) {
        System.out.println("Użytkownik został dodany do bazy!");
    }
}
