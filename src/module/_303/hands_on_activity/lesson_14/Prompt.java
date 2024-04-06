package module._303.hands_on_activity.lesson_14;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public interface Prompt {
    static List<Integer> getIntegers(BufferedReader reader) {
        var numbers = new ArrayList<Integer>();
        do {
            try {
                var inputValues = promptForInput(reader, buildGetNumberMessage(numbers));

                for (var value : inputValues) {
                    if (value.equalsIgnoreCase("done")) { return numbers; }

                    numbers.add(Integer.parseInt(value));
                }
            } catch (Exception e) {
                System.out.println("Invalid number. Try again.");
            }
        } while (true);
    }

    static Arithmetic getOperation(BufferedReader reader) {
        String message = buildGetOperationMessage();
        do {
            try {
                var selection = Stream.of(promptForInput(reader, message)).map(Integer::parseInt).findFirst().orElse(0);
                var operation = Arithmetic.valueOf(selection);

                if (operation != null) { return operation; }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Invalid operation. Try again.");
            }
        } while (true);
    }

    static boolean continueOperation(BufferedReader reader) {
        String message = "Do you want to perform another operation? (yes/no)";
        do {
            try {
                String response = Stream.of(promptForInput(reader, message)).findFirst().orElse("");
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

    private static String[] promptForInput(BufferedReader reader, String message) {
        do {
            try {
                System.out.println(message);
                var input = reader.readLine().split(" ");

                return Stream.of(input).filter(value -> !value.isBlank()).toArray(String[]::new);
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        } while (true);
    }

    private static String buildGetOperationMessage() {
        var messageBuilder = new StringBuilder();

        messageBuilder.append("Choose a number to perform an operation:\n");
        List.of(Arithmetic.values()).forEach(operation -> messageBuilder.append(STR."\{operation.getIndex()}. \{operation.toString()}\n"));
        return messageBuilder.deleteCharAt(messageBuilder.length() - 1).toString();
    }

    private static String buildGetNumberMessage(List<Integer> numbers) {
        var currentList = "Current list of integers: ";
        var promptUserInput = "Enter a list of integer to perform an operation. Type 'done' to finish.";
        var messageBuilder = new StringBuilder();

        if (!numbers.isEmpty()) {
            var list = numbers.toString().replaceAll("[\\[\\]]", "");

            messageBuilder.append(currentList).append(list).append("\n");
        }
        messageBuilder.append(promptUserInput);
        return messageBuilder.toString();
    }
}