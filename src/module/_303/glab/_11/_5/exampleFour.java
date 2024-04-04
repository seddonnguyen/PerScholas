package module._303.glab._11._5;

import java.util.HashSet;
import java.util.Set;

public class exampleFour {
    public static void main(String[] args) {
        Set<String> hset = new HashSet<>();

        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");

        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");

        //Addition of null values
        hset.add(null);
        hset.add(null);

        //Displaying HashSet elements
        for (String str : hset) {
            System.out.println(STR." ---> \{str}");
        }
    }
}
