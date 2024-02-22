package pl.programujodpodstaw.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private final List<User> users = new ArrayList<>();

    public UserController() {
        User user = new User("Kamil", 35);
        User user1 = new User("Mariusz", 30);
        User user2 = new User("Dominik", 25);

        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", users);
        model.addAttribute("newUser", new User());

        return "users";
    }

    @PostMapping("/users")
    public String addUser(@ModelAttribute User user) {
        users.add(user);

        return "redirect:/users";
    }

    @DeleteMapping("/users/{name}")
    public String deleteUser(@PathVariable String name) {
        users.removeIf(user -> user.getName().equals(name));

        return "redirect:/users";
    }
}
