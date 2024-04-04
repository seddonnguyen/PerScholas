package module._303.glab._11._6;

import java.util.HashMap;
import java.util.Map;

public class ExampleOneHashMap {
    public static void main(String[] args) {
        Map<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println(STR."HashMap: \{languages}");

        // remove element with key 2
        String value = languages.remove(2);
        System.out.println(STR."Removed value: \{value}");
        System.out.println(STR."Updated HashMap: \{languages}");
    }
}
