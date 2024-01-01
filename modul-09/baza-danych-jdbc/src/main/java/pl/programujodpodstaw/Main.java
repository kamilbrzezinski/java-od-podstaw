package pl.programujodpodstaw;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_od_podstaw",
                "root", "kamil")) {

            String addUserSql = "INSERT INTO user(login, display_name, year_of_birth) " +
                    "VALUES('nowy_uzytkownik', 'Nowy', 1993)";

            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(addUserSql);
            }

            String sql = "SELECT id, login, display_name, year_of_birth" +
                    " FROM user";

            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sql)) {
                    while (resultSet.next()) {
                        System.out.println(resultSet.getInt("id"));
                        System.out.println(resultSet.getString("login"));
                        System.out.println(resultSet.getString("display_name"));
                        System.out.println(resultSet.getInt("year_of_birth"));
                        System.out.println();
                    }
                }
            }
        }


    }
}