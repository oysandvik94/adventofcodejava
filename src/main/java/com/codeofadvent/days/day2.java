package com.codeofadvent.days;

import com.codeofadvent.util.Utils;

import java.util.*;

public class day2 {
    public static int puzzle1() {
        Utils util = new Utils();
        List<String> lines = util.readFileToList("day2input.txt");

        int twos = 0;
        int threes = 0;

        for (String line : lines) {
            Map<Character, Integer> dupes = new HashMap<>();
            for (int i = 0; i < line.length(); i++) {
                char key = line.charAt(i);
                int count = dupes.getOrDefault(key, 0);
                dupes.put(key, ++count);
            }
            if (dupes.containsValue(2)) { twos++; }
            if (dupes.containsValue(3)) { threes++; }
        }

        return twos * threes;
    }

    public static String puzzle2() {
        Utils util = new Utils();
        List<String> lines = util.readFileToList("day2input.txt");

        for (String lineA : lines) {
            for (String lineB : lines) {
                int errorCounter = 0;
                StringBuilder theString = new StringBuilder();
                for (int i = 0; i < lineA.length(); i++) {
                    if (lineA.charAt(i) != lineB.charAt(i)) {
                        errorCounter++;
                    } else {
                        theString.append(lineB.charAt(i));
                    }
                }
                if (errorCounter == 1) {
                    return theString.toString();
                }
            }
        }
        return "error";
    }
}
