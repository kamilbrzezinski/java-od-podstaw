package org.example;

public class Moderator extends User {
    public void editPost(String post, int id) {
        System.out.println("Edytowanie posta o id " +
                id);
    }
}
