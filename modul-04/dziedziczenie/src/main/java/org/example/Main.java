package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.addPost("nowy post");

        Moderator moderator = new Moderator();
        moderator.editPost("nowszy post", 1);

        Administrator administrator = new Administrator();
        administrator.deletePost(1);

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(moderator);
        users.add(administrator);
    }
}