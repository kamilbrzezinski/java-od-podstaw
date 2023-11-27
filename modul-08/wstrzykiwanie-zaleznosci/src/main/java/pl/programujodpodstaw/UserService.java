package pl.programujodpodstaw;

public class UserService {
    private final DatabaseConnection databaseConnection;

    // dependency injection - wstrzykiwanie zależności
    // Inversion of Control (IoC)
    public UserService(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void registerUser(String username) {
        // tight coupling - silne powiązania między klasami

        // loose coupling - podejście, w którym klasy są ze sobą luźno powiązane

        databaseConnection.addUserToDatabase(username);
    }
}
