package module._303.glab._11._5;


import java.util.HashSet;
import java.util.Set;

public class exampleOne {
    public static void main(String[] args) {
        Set<Integer> evenNumber = new HashSet<>();
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println(STR."HashSet: \{evenNumber}");

        // Using addAll() method
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println(STR."New HashSet: \{numbers}");
    }
}
