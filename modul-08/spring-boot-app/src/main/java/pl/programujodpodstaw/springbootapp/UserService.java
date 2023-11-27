package pl.programujodpodstaw.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final DatabaseConnection databaseConnection;

    @Autowired
    public UserService(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void registerUser(String username) {
        databaseConnection.addUserToDatabase(username);
    }
}
