package module._303.glab._11._4;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class LinkedListSortExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        // Before sorting
        System.out.println(STR."Before Sorting: \{linkedList}");

        // Sorting in ascending order
        Collections.sort(linkedList);
        System.out.println(STR."After Sorting in ascending order: \{linkedList}");

        // Custom sorting in descending order
        linkedList.sort(Collections.reverseOrder());
        System.out.println(STR."After Sorting in descending order: \{linkedList}");
    }
}
