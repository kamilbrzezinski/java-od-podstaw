package pl.programujodpodstaw;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Polska", "Warszawa");
        map1.put("Niemcy", "Berlin");
        map1.put("Francja", "Paryż");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Polska", "Kraków");
        map2.put("Francja", "Paryż");
        map2.put("Czechy", "Praga");
        map2.put("Słowacja", "Bratysława");
        map2.put("Germania", "Berlin");

        MapDifference<String, String> difference = Maps.difference(map1, map2);

        Map<String, MapDifference.ValueDifference<String>> differing = difference.entriesDiffering();
        System.out.println(differing);

        Map<String, String> inCommon = difference.entriesInCommon();
        System.out.println(inCommon);

        Map<String, String> onLeft = difference.entriesOnlyOnLeft();
        System.out.println(onLeft);

        Map<String, String> onRight = difference.entriesOnlyOnRight();
        System.out.println(onRight);
    }
}