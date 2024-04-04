package module._303.pa._7._1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3: Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.”
        Print out the array length.
        Make a copy using the clone() method.
        Use the Arrays.toString() method on the new array to verify that the original array was copied.
         */
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println("Array length: " + colors.length);
        String[] colorsCopy = colors.clone();
        System.out.println("Original array: " + Arrays.toString(colors));
        System.out.println("Copied array: " + Arrays.toString(colorsCopy));
    }
}
