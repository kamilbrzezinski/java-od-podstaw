package pl.programujodpodstaw.springbootapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Spring Bean
@Component
public class DatabaseConnection {
    private final String host;
    private final String username;
    private final String password;

    public DatabaseConnection(@Value("localhost") String host, @Value("kamil") String username, @Value("tajnehaslo") String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public void addUserToDatabase(String username) {
        System.out.println("Użytkownik został dodany do bazy danych!");
    }
}
