package org.example;

public class Main {
    public static void main(String[] args) {
        Drive drive = new Drive(null, 2);
        Computer computer = new Computer(drive);

//        System.out.println(computer.getDrive().getName().toUpperCase());
//
//        if (computer.getDrive() != null) {
//            if (computer.getDrive().getName() != null) {
//                System.out.println(computer.getDrive().getName().toUpperCase());
//            }
//        }

//        if (computer.getDrive().isPresent()) {
//            Drive drive1 = computer.getDrive().get();
//
//            if (drive1.getName().isPresent()) {
//                String name = drive1.getName().get();
//                System.out.println(name.toUpperCase());
//            }
//        }

        String name = computer.getDrive()
                .flatMap(Drive::getName)
                .orElseGet(Main::getDefault);

        System.out.println(name);
    }

    private static String getDefault() {
        System.out.println("TO SIĘ WYKONAŁO");
        return "Domyślna nazwa";
    }
}