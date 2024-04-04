package module._303.glab._11._5;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExampleTwo {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println(STR."TreeSet elements: \{numbers}");

        // Using the remove() method
        boolean isRemoved = numbers.remove(5);
        System.out.println(STR."Is 5 removed? \{isRemoved}");

        // Using the removeAll() method
        boolean isAllRemoved = numbers.removeAll(numbers);
        System.out.println(STR."Are all elements removed? \{isAllRemoved}");
    }
}
