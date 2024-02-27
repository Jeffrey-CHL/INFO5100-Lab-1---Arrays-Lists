package com.example;

import java.util.ArrayList;
import java.util.List;

public class NameSwitcher {
    public static void main(String[] args) {
        // Initialize a list of names
        List<String> names = new ArrayList<>();
        names.add("Jeffrey");
        names.add("Hanlin");
        names.add("Charlie");
        names.add("Diana");
        names.add("Ethan");

        // Print the original list of names
        System.out.println("Names = " + names);

        // Switch first and last letters and print the result
        List<String> switchedNames = switchFirstLast(names);
        System.out.println("Names (switched) = " + switchedNames);
    }

    private static List<String> switchFirstLast(List<String> names) {
        List<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            if (name.length() > 1) {
                String switchedName = name.substring(name.length() - 1).toUpperCase() +
                                      name.substring(1, name.length() - 1) +
                                      name.substring(0, 1).toLowerCase();
                switchedNames.add(switchedName);
            } else {
                switchedNames.add(name);
            }
        }
        return switchedNames;
    }
}
