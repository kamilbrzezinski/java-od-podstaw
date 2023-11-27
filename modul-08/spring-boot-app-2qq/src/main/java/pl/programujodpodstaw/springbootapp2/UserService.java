package pl.programujodpodstaw.springbootapp2;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final DatabaseConnection databaseConnection;

    public UserService(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void registerUser(String username) {
        databaseConnection.addUserToDatabase(username);
    }
}
