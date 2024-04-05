package module._303.hands_on_activity.lesson_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Supplier;
import java.util.stream.Stream;

public abstract class MainEntry {
    public static Calc<Integer> add = new Calc<>() {
        @Override
        public Integer compute(Integer[] values) {
            return Stream.of(values).reduce(Integer::sum).orElse(0);
        }
    };

    public static Calc<Integer> subtract = values -> Stream.of(values).reduce((a, b) -> a - b).orElse(0);

    public static Supplier<Calc<Integer>> multiply = () -> values -> Stream.of(values).reduce((a, b) -> a * b).orElse(0);

    public static Calc<Double> divide = values -> {
        try {
            return calculateDivision(values);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    };

    private static Double calculateDivision(Double[] values) throws Exception {
        if (values.length < 2) {
            throw new Exception("Division requires at least two numbers.");
        }
        if (values.length > 2) {
            throw new Exception("Division requires only two numbers.");
        }
        if (values[1] == 0) {
            throw new Exception("Cannot divide by zero.");
        }
        return Stream.of(values).reduce((a, b) -> a / b).orElse(0.0);
    }

    private static List<Integer> getNumbers(BufferedReader reader) {
        var numbers = new ArrayList<Integer>();

        do {
            try {
                System.out.println("Enter a list of numbers to perform an operation. Type 'done' to finish.");
                var input = reader.readLine().split(" ");
                var values = Stream.of(input).filter(value -> !value.isBlank()).toArray(String[]::new);

                for (var value : values) {
                    if (value.equalsIgnoreCase("done")) {
                        return numbers;
                    }
                    numbers.add(Integer.parseInt(value));
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");

                if (!numbers.isEmpty()) {
                    System.out.println(STR."Current list of numbers: \{numbers.toString().replaceAll("[\\[\\]]", "")}");
                }
            }
        } while (true);
    }


    private static ArithmeticOperation getOperation(BufferedReader reader) {
        do {
            try {
                System.out.println("""
                        Choose a number to perform an operation:
                        1. Add
                        2. Subtract
                        3. Multiply
                        4. Divide""");

                String[] input = reader.readLine().split(" ");
                int operationValue = Stream.of(input).filter(value -> !value.isBlank()).map(Integer::parseInt).findFirst().orElse(0);
                var operation = ArithmeticOperation.valueOf(operationValue);

                if (operation != null) {
                    return operation;
                }
                throw new Exception("Invalid operation. Try again.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    private static boolean isDone(BufferedReader reader) {
        do {
            try {
                System.out.println("Do you want to perform another operation? (yes/no)");
                var response = reader.readLine().trim();

                return switch (response.toLowerCase()) {
                    case "yes" -> false;
                    case "no" -> true;
                    default -> throw new Exception("Invalid response. Try again.");
                };
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");

        try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                runCalculator(reader);
            } while (!isDone(reader));
        } catch (Exception e) {
            System.out.println(STR."An error occurred. \{e.getMessage()}");
        }
        System.out.println("Goodbye!");
    }

    private static void runCalculator(BufferedReader reader) {
        try {
            var values = getNumbers(reader);
            var operation = getOperation(reader);
            String numbers = values.toString().replaceAll("[\\[\\]]", "");

            switch (operation) {
                case ADD ->
                        System.out.println(STR."\{numbers.replaceAll(", ", " + ")} = \{add.compute(values.toArray(new Integer[0]))}");
                case SUBTRACT ->
                        System.out.println(STR."\{numbers.replaceAll(", ", " - ")} = \{subtract.compute(values.toArray(new Integer[0]))}");
                case MULTIPLY ->
                        System.out.println(STR."\{numbers.replaceAll(", ", " * ")} = \{multiply.get().compute(values.toArray(new Integer[0]))}");
                case DIVIDE -> {
                    Double[] doubleValues = values.stream().map(Integer::doubleValue).toArray(Double[]::new);
                    System.out.println(STR."\{numbers.replaceAll(", ", " / ")} = \{divide.compute(doubleValues)}");
                }
                default -> System.out.println("Invalid operation. Try again.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private enum ArithmeticOperation {
        ADD(1), SUBTRACT(2), MULTIPLY(3), DIVIDE(4);
        private static final Map<Integer, ArithmeticOperation> BY_VALUE = new HashMap<>();

        static {
            Stream.of(values()).forEach(operation -> BY_VALUE.put(operation.value, operation));
        }

        private final int value;

        ArithmeticOperation(int value) {
            this.value = value;
        }

        public static ArithmeticOperation valueOf(int value) {
            return BY_VALUE.get(value);
        }
    }
}