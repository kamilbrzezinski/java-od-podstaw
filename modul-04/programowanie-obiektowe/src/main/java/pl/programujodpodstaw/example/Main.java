package pl.programujodpodstaw.example;

public class Main {
    public static void main(String[] args) {
//        User user1 = new User();
//        User user2 = new User();
//
//        user1.name = "Kamil";
//        user1.age = 35;
//        user1.isActive = true;
//
//        user2.name = "Mariusz";
//        user2.age = 27;
//        user2.isActive = false;
//
//        User user3 = new User();
//        user3.hello();


//        System.out.println(user2.name);
//        System.out.println(user2.age);
//        System.out.println(user2.isActive);

        User user = new User("Kamil", 35, true, "kamil@programujodpodstaw.pl");
//        user.printUserInformation();
//        System.out.println(user.canBuyProduct());
        user.sendEmail("Miło Cię widzieć!");
        user.sendEmail("Miło Cię widzieć!", "Witam!");
    }
}