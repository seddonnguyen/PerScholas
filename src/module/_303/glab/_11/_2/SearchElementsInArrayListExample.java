package module._303.glab._11._2;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("Index of \"Steve\" in names array : " + names.indexOf("Steve"));
        System.out.println("Index of \"Mark\" in names array : " + names.indexOf("Mark"));

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("Last index of \"John\" in names array : " + names.lastIndexOf("John"));
        System.out.println("Last index of \"Bill\" in names array : " + names.lastIndexOf("Bill"));
    }
}
