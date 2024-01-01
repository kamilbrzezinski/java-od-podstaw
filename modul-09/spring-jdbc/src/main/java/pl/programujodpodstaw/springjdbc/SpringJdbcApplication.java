package pl.programujodpodstaw.springjdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication.class, args);
    }

    @Bean
    public CommandLineRunner runApp(JdbcTemplate jdbcTemplate) {
        return (args -> {
            String sql = "SELECT id, login, display_name, year_of_birth FROM user";

            List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));

            for (User user : users) {
                System.out.println(user.getId());
                System.out.println(user.getLogin());
                System.out.println(user.getDisplayName());
                System.out.println(user.getYearOfBirth());
                System.out.println();
            }

        });
    }
}
