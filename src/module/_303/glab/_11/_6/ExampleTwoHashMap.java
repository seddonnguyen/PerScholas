package module._303.glab._11._6;

import java.util.HashMap;
import java.util.Map;

public class ExampleTwoHashMap {
    public static void main(String[] args) {
        Map<String, String> newHashMap = new HashMap<>();
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");
        System.out.println(STR."Original HashMap: \{newHashMap}");
        System.out.println(STR."Size of Original HashMap: \{newHashMap.size()}");

        // Copy contains of one HashMap to another
        Map<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println(STR."Copied HashMap: \{copyHashMap}");

        // Removal of null key
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println(STR."copyHashMap null key value: \{nullKeyValue}");
        System.out.println(STR."copyHashMap after removal of null key: \{copyHashMap}");
        System.out.println(STR."Size of copyHashMap after removal of null key: \{copyHashMap.size()}");


    }
}
