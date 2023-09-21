import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Jak masz na imię?");
//        String name = scanner.nextLine();
//
//        System.out.println("Ile masz lat?");
//        int age = scanner.nextInt();
//
//        if (age >= 18 && name.endsWith("a")) {
//            System.out.println("Jesteś pełnoletnia");
//        } else if (age >= 18 && !name.endsWith("a")) {
//            System.out.println("Jesteś pełnoletni");
//        } else if (age < 18 && name.endsWith("a")) {
//            System.out.println("Jeszcze nie jesteś pełnoletnia");
//        } else if (age < 18 && !name.endsWith("a")) {
//            System.out.println("Jeszcze nie jesteś pełnoletni");
//        }

        System.out.println("Jakie jest światło? (zielone, żółte, czerwone)");
        String light = scanner.nextLine();

        switch (light) {
            case "zielone" -> System.out.println("Jedź");
            case "żółte" -> System.out.println("Poczekaj!");
            case "czerwone" -> System.out.println("Stój!");
            default -> System.out.println("Nie znam takiego koloru światła");
        }
    }
}