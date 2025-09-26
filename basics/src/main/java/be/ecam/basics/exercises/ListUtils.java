package be.ecam.basics.exercises;

import java.util.*;

public class ListUtils {
    public static List<String> removeShortStrings(List<String> list, int minLen) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.length() < minLen) {
                iterator.remove();
            }
        }
        return list;
    }
}