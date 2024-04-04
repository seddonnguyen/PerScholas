package module._303.glab._11._6;

import java.util.TreeMap;

public class exampleTreemapTwo {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println(STR."TreeMap elements: \{numbers}");

        // Using the firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println(STR."First key: \{firstKey}");

        // Using the lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println(STR."Last key: \{lastKey}");

        // Using the firstEntry() method
        System.out.println(STR."First entry: \{numbers.firstEntry()}");

        // Using the lastEntry() method
        System.out.println(STR."Last entry: \{numbers.lastEntry()}");

    }
}
