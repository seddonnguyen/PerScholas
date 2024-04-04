package module._303.glab._11._5;

import java.util.TreeSet;

public class TreeSetExampleThree {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println(STR."TreeSet: \{numbers}");

        // Using the first() method
        System.out.println(STR."First Number: " + numbers.first());

        // Using the last() method
        System.out.println(STR."Last Number: " + numbers.last());
    }
}
