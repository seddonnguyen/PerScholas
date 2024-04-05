package module._303.hands_on_activity.lesson_14;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.stream.Stream;

public interface Prompt {
    static Integer[] getIntegers(BufferedReader reader) {
        var numbers = new ArrayList<Integer>();

        do {
            try {
                if (!numbers.isEmpty()) {
                    System.out.println(STR."Current list of numbers: \{numbers.toString().replaceAll("[\\[\\]]", "")}");
                }
                System.out.println("Enter a list of integer to perform an operation. Type 'done' to finish.");

                var input = reader.readLine().split(" ");
                var values = Stream.of(input).filter(value -> !value.isBlank()).toArray(String[]::new);

                for (var value : values) {
                    if (value.equalsIgnoreCase("done")) {
                        return numbers.toArray(new Integer[0]);
                    }
                    numbers.add(Integer.parseInt(value));
                }
            } catch (Exception e) {
                System.out.println("Invalid number. Try again.");
            }
        } while (true);
    }

    static ArithmeticOperation getOperation(BufferedReader reader) {
        var operations = ArithmeticOperation.values();
        do {
            try {
                System.out.println("Choose a number to perform an operation:");
                for (var operation : operations) {
                    var name = operation.name().charAt(0) + operation.name().substring(1).toLowerCase();
                    System.out.println(STR."\{operation.getIndex()}. \{name}");
                }

                String[] input = reader.readLine().split(" ");
                int operationIndex = Stream.of(input).filter(value -> !value.isBlank()).map(Integer::parseInt).findFirst().orElse(0);
                var operation = ArithmeticOperation.valueOf(operationIndex);

                if (operation != null) {
                    return operation;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Invalid operation. Try again.");
            }
        } while (true);
    }

     static boolean continueOperation(BufferedReader reader) {
        do {
            try {
                System.out.println("Do you want to perform another operation? (yes/no)");
                var response = reader.readLine().trim();

                return switch (response.toLowerCase()) {
                    case "yes" -> true;
                    case "no" -> false;
                    default -> throw new Exception("Invalid response. Try again.");
                };
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
