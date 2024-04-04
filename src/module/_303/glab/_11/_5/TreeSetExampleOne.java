package module._303.glab._11._5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExampleOne {
    public static void main(String[] args) {
        Set<Integer> numTreeSet = new TreeSet<Integer>();
        numTreeSet.add(20);
        numTreeSet.add(5);
        numTreeSet.add(15);
        numTreeSet.add(25);
        numTreeSet.add(10);

        Iterator<Integer> iterSet = numTreeSet.iterator();
        System.out.println("TreeSet elements using iterator:");
        while (iterSet.hasNext()) {
            System.out.print(STR."\{iterSet.next()}, ");
        }
    }
}
