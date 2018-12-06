package com.codeofadvent.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    private ClassLoader classloader;

    public Utils() {
        classloader = getClass().getClassLoader();
    }

    public List<String> readFileToList(String filename) {
        List<String> result = new ArrayList<>();
        File file = new File(classloader.getResource(filename).getFile());

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()){
                result.add(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
