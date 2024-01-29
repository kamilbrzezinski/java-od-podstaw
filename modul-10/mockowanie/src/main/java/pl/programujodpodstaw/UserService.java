package pl.programujodpodstaw;

import java.util.Comparator;

public class UserService {
    private final DatabaseService databaseService;

    public UserService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public User getYoungestUser() {
        databaseService.test();
        databaseService.test();
        databaseService.test();
        databaseService.test2();

        return databaseService.getAllUsers()
                .stream()
                .max(Comparator.comparingInt(User::yearOfBirth))
                .orElseThrow(RuntimeException::new);
    }
}
