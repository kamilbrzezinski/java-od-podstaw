package pl.programujodpodstaw;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
//    private final static Map<String, String> countriesAndCapitals = new HashMap<>();
    private final static BiMap<String, String> countriesAndCapitals = HashBiMap.create();

    public static void main(String[] args) {
        countriesAndCapitals.put("Polska", "Warszawa");
        countriesAndCapitals.put("Niemcy", "Berlin");
        countriesAndCapitals.put("Francja", "Paryż");

        String capital = countriesAndCapitals.get("Polska");
//        System.out.println(capital);

//        System.out.println(getCountry("Berlin"));
        System.out.println(countriesAndCapitals.inverse().get("Berlin"));
    }

    private static String getCountry(String capital) {
        Set<String> countries = countriesAndCapitals.keySet();

        for (String country : countries) {
            if (capital.equals(countriesAndCapitals.get(country))) {
                return country;
            }
        }

        return null;
    }
}