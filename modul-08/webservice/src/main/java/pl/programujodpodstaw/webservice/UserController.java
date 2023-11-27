package pl.programujodpodstaw.webservice;

import com.google.gson.Gson;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;

@RestController
public class UserController {

    // endpoint users
    @GetMapping("users")
    public ResponseEntity<List<User>> getAllUsers() throws IOException {
        Reader input = new FileReader("src/main/resources/users.csv");

        CSVFormat csvFormat = getCSVFormat();

        CSVParser parser = csvFormat.parse(input);

        List<User> users = parser.stream()
                .map(record -> {
                    String name = record.get("name");
                    int age = Integer.parseInt(record.get("age"));
                    boolean isMale = Boolean.parseBoolean(record.get("isMale"));

                    return new User(name, age, isMale);
                })
                .toList();

        return ResponseEntity.ok(users);
    }

    // endpoint users
    @PostMapping("users")
    public ResponseEntity<User> addUser(@RequestBody User user) throws IOException {
        CSVFormat csvFormat = getCSVFormat();

        try (CSVPrinter printer = new CSVPrinter(new FileWriter("src/main/resources/users.csv", true), csvFormat)) {
            printer.printRecord(user.name(), user.age(), user.isMale());
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    private CSVFormat getCSVFormat() {
        return CSVFormat.DEFAULT.builder()
                .setHeader("name", "age", "isMale")
                .setSkipHeaderRecord(true)
                .build();
    }
}
