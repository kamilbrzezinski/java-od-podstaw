package pl.programujodpodstaw;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.WARNING);
        consoleHandler.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(consoleHandler);
        LOGGER.setUseParentHandlers(false);

        User user = new User("Kamil", "Brzeziński");

        LOGGER.severe("Przed capitalizeName");
        user.capitalizeName();

        LOGGER.warning("Przed capitalizeLastName");
        user.capitalizeLastName();

        System.out.println(user.isMale());
    }
}