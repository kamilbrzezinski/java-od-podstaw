package pl.programujodpodstaw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {
    @Test
    public void checkGetYoungestUser() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "login1", "LOGIN", 1990));
        users.add(new User(2, "login2", "LOGIN2", 1980));
        users.add(new User(3, "login3", "LOGIN3", 1985));
        users.add(new User(4, "login4", "LOGIN4", 1995));

//        DatabaseService databaseService = new DatabaseService("jdbc:mysql://localhost:3306/java_od_podstaw", "root", "kamil");
        DatabaseService databaseService = mock(DatabaseService.class);

        when(databaseService.getAllUsers()).thenReturn(users);

        UserService userService = new UserService(databaseService);

        User youngestUser = userService.getYoungestUser();

//        verify(databaseService).test();
        verify(databaseService).test2();

        verify(databaseService, atLeast(4)).test();

        assertEquals("login4", youngestUser.login());
    }
}
