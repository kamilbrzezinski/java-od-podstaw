package pl.programujodpodstaw;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import org.apache.commons.text.WordUtils;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Jak masz na imię?");
//        String name = scanner.nextLine();

//        System.out.println("Cześć " + name + "!");
//        String formatted = String.format("Cześć %s, %s, %s!", name);
//        System.out.println(formatted);
//        String template = "Cześć ${imie}!";
//        StringSubstitutor substitutor = new StringSubstitutor(Map.of("imie", name));
//
//        String out = substitutor.replace(template);
//        System.out.println(out);

//        String text = "programuj od podstaw";
//        String capitalized = StringUtils.capitalize(text);
//        String capitalized1 = WordUtils.capitalize(text);
//        System.out.println(StringUtils.isBlank("   "));
//
//        System.out.println(capitalized);
//        System.out.println(capitalized1);

        // blank - null LUB "" LUB " " LUB "   " LUB "              "
        // empty - null LUB ""

//        System.out.println(StringUtils.isBlank(null));
//        System.out.println(StringUtils.isBlank(""));
//        System.out.println(StringUtils.isBlank(" "));

//        String name = StringUtils.defaultString(getName(), "default name");
//        System.out.println("Cześć " + name.toUpperCase() + "!");

//        BidiMap<String, String> map = new TreeBidiMap<>();
//        map.put("Polska", "Warszawa");
//        map.put("Niemcy", "Berlin");
//        map.put("Francja", "Paryż");
//
//        System.out.println(map.get("Polska"));
//        System.out.println(map.getKey("Berlin"));

//        Bag<String> names = new HashBag<>();
//        names.add("Kamil", 3);
//        names.add("Mariusz", 2);
//        names.add("Dominik");

//        names.remove("Kamil", 2);
//        System.out.println(names.getCount("Mariusz"));
//
//        names.forEach(System.out::println);

//        names.uniqueSet().forEach(System.out::println);
        OrderedMap<String, String> map = new LinkedMap<>();
        map.put("Polska", "Warszawa");
        map.put("Niemcy", "Berlin");
        map.put("Francja", "Paryż");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.nextKey("Polska"));
        System.out.println(map.previousKey("Polska"));
    }

//    private static String getName() {
//        return null;
//    }
}