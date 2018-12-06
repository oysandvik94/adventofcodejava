package com.codeofadvent.days;

import com.codeofadvent.util.Utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class day1 {

    private static final String DAY_1_INPUT = "day1input.txt";

    public static int puzzle1() {
        int frequency = 0;
        Utils util = new Utils();
        List<String> frequencies = util.readFileToList(DAY_1_INPUT);
        for (String freq:frequencies) {
            frequency += Integer.parseInt(freq);
        }
        return frequency;
    }

    public static int puzzle2() {
        Utils util = new Utils();
        List<String> frequencies = util.readFileToList(DAY_1_INPUT);
        int frequency = 0;
        Set<Integer> storedVals = new HashSet<>();
        for (int i = 0; i < frequencies.size(); i++) {
            frequency += Integer.parseInt(frequencies.get(i));
            if (storedVals.contains(frequency)) {
                return frequency;
            } else {
                storedVals.add(frequency);
            }

            if (i == frequencies.size() - 1) {
                i = -1;
            }
        }
        return -1;
    }
}
