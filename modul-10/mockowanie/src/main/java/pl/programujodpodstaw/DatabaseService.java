package pl.programujodpodstaw;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService {
    private final String host;
    private final String user;
    private final String password;

    public DatabaseService(String host, String user, String password) {
        this.host = host;
        this.user = user;
        this.password = password;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT id, login, display_name, year_of_birth FROM user";

        try (Connection connection = DriverManager.getConnection(host, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String login = resultSet.getString("login");
                    String displayName = resultSet.getString("display_name");
                    int yearOfBirth = resultSet.getInt("year_of_birth");

                    users.add(new User(id, login, displayName, yearOfBirth));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }

    public void test() {}
    public void test2() {}

}
