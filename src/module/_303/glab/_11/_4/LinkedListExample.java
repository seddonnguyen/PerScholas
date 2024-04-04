package module._303.glab._11._4;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");

        // Display the linked list content
        System.out.println(STR."Linked List Content: \{linkedList}");

        // Add First and Last
        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");
        System.out.println(STR."LinkedList Content after addition: \{linkedList}");

        // This is how to get and set Values
        Object firstvar = linkedList.get(0);
        System.out.println(STR."First element: \{firstvar}");
        linkedList.set(0, "Changed first item");
        Object firstvar2 = linkedList.get(0);
        System.out.println(STR."First element after update by set method: \{firstvar2}");

        // Remove first and last element
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(STR."LinkedList after deletion of first and last element: \{linkedList}");

        // Add to a Position and remove from a position
        linkedList.add(0, "Newly added item");
        linkedList.remove(2);
        System.out.println(STR."Final Content: \{linkedList}");
    }
}
