package pl.programujodpodstaw.springbootapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp2Application implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.registerUser("Kamil");
    }
}
