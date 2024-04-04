package module._303.example.play;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Predicate<String> checkLength = (String s) -> s.length() == 8;
        Consumer<String> print = s -> System.out.println(s);
        System.out.println("Functional Interfaces having length 8 are:-");
       var FunctionalInterfaces = Arrays.asList("Predicate", "Function", "Consumer", "Supplier");
        FunctionalInterfaces.forEach(print);

    }
}
