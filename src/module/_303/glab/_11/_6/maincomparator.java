package module._303.glab._11._6;

import java.util.TreeMap;
import java.util.Map;

public class maincomparator {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>(new CustomComparator());
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println(STR."TreeMap: \{numbers}");
    }
}
