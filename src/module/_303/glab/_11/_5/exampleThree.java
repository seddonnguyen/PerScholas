package module._303.glab._11._5;

import java.util.HashSet;
import java.util.Set;

public class exampleThree {
    public static void main(String[] args) {
        Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println(STR."HashSet1: \{primeNumbers}");

        Set<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        System.out.println(STR."HashSet2: \{oddNumbers}");

        // Difference between primeNumbers and oddNumbers
        primeNumbers.removeAll(oddNumbers);
        System.out.println(STR."Difference: \{primeNumbers}");
    }
}
