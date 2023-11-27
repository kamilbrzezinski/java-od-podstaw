package pl.programujodpodstaw;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Kamil");
//        names.add("Mariusz");
//        names.add(null);
//        names.add("Dominik");

//        String joined = String.join("; ", names);
//        System.out.println(joined);
//
//        String joined1 = Joiner.on("; ").skipNulls().join(names);
//        System.out.println(joined1);
//
//        String joined2 = Joiner.on("; ").useForNull("DOMYŚLNE IMIĘ").join(names);
//        System.out.println(joined2);

        String longText = ", Kamil,Mariusz,,Dominik ,";
        String[] split = longText.split(",");
        List<String> names = Arrays.asList(split);

        System.out.println(names);

        List<String> names2 = Splitter.on(",")
                .trimResults()
                .omitEmptyStrings()
                .splitToList(longText);

        System.out.println(names2);
    }
}