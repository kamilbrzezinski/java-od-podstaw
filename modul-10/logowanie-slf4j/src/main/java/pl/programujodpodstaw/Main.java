package pl.programujodpodstaw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Hello world!");

        LOGGER.warn("this is warning");
        LOGGER.error("this is error");
        LOGGER.info("this is info");
    }
}