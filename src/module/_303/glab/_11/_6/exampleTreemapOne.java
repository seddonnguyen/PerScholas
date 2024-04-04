package module._303.glab._11._6;

import java.util.TreeMap;
import java.util.Map;

public class exampleTreemapOne {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println(STR."TreeMap elements: \{numbers}");

        // Remove method with a single parameter
        int value = numbers.remove("Two");
        System.out.println(STR."Removed value: \{value}");

        // Remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println(STR."Remove result: \{result}");
        System.out.println(STR."Updated TreeMap after removal: \{numbers}");

    }
}
