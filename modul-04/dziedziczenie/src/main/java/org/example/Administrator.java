package org.example;

public class Administrator extends Moderator {
    public void deletePost(int id) {
        System.out.println("Usuwanie posta o id " + id);
    }
}
