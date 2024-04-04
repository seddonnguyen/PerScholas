package module._303.glab._11._5;

import java.util.HashSet;
import java.util.Set;

public class exampleTwo {
    public static void main(String[] args) {
        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println(STR."HashSet1: \{evenNumbers}");

        Set<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        System.out.println(STR."HashSet2: \{oddNumbers}");

        // Union of two sets
        oddNumbers.addAll(evenNumbers);
        System.out.println(STR."Union is: \{oddNumbers}");
    }
}
