package com.example;

public class ArrayMax {
    public static void main(String[] args) {
        // Initialize arrays x and y
        int[] x = {1, 3, 5, 7, 9};
        int[] y = {2, 4, 6, 8, 10};
        int[] z = new int[5]; // to store the max values from x and y

        // Compute elements of z
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Print the results
        System.out.println("Array x = " + arrayToString(x));
        System.out.println("Array y = " + arrayToString(y));
        System.out.println("Array z = x + y = " + arrayToString(z));
    }

    private static String arrayToString(int[] array) {
        String result = "{";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i < array.length - 1) {
                result += ", ";
            }
        }
        result += "}";
        return result;
    }
}
