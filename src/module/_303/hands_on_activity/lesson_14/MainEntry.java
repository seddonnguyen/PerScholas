package module._303.hands_on_activity.lesson_14;

import java.util.Scanner;
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

    private static List<Integer> getNumbers(Scanner scanner) {
        var values = new ArrayList<Integer>();
        boolean isDone = false;
        do {
            System.out.println("Enter a list of numbers to perform an operation. Type 'done' to finish.");
            var input = scanner.nextLine().split(" ");
            input = Stream.of(input).filter(value -> !value.isBlank()).toArray(String[]::new);

            try {
                for (String value : input) {
                    if (value.equalsIgnoreCase("done")) {
                        isDone = true;
                        break;
                    }
                    values.add(Integer.parseInt(value));
                }
            } catch (NumberFormatException e) {
                System.out.println(STR."""
                Invalid input. \{e.getMessage()}. Try again.
                Current values: \{values}""");
            }
        } while (!isDone);
        return values;
    }

    private static ArithmeticOperation getOperation(Scanner scanner) {
        boolean isDone = false;
        ArithmeticOperation operation = null;
        do {
            try {
                System.out.println("""
                        Choose a number to perform an operation:
                        1. Add
                        2. Subtract
                        3. Multiply
                        4. Divide""");
                operation = ArithmeticOperation.valueOf(scanner.nextInt());
                if (operation == null) {
                    System.out.println("Invalid operation. Try again.");
                } else {
                    isDone = true;
                }
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid operation. Try again.");
                scanner.nextLine();
            }
        } while (!isDone);
        return operation;
    }

    private static boolean isDone(Scanner scanner) {
        do {
            try {
                System.out.println("Do you want to perform another operation? (yes/no)");
                String response = scanner.nextLine().trim();
                switch (response.toLowerCase()) {
                    case "yes" -> {
                        return false;
                    }
                    case "no" -> {
                        return true;
                    }
                    default -> throw new Exception("Invalid response. Try again.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static void main(String[] args) {
        boolean isDone = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                runCalculator(scanner);
                isDone = isDone(scanner);
            } catch (Exception e) {
                System.out.println(STR."An error occurred. \{e.getMessage()}");
            }
        } while (!isDone);
        scanner.close();
        System.out.println("Goodbye!");
    }

    private static void runCalculator(Scanner scanner) {
        try {
            List<Integer> values = getNumbers(scanner);
            ArithmeticOperation operation = getOperation(scanner);

            switch (operation) {
                case ADD -> System.out.println(STR."""
                Numbers to add: \{values}
                Result: \{add.compute(values.toArray(new Integer[0]))}""");

                case SUBTRACT -> System.out.println(STR."""
                Numbers to subtract: \{values}
                Result: \{subtract.compute(values.toArray(new Integer[0]))}""");

                case MULTIPLY -> System.out.println(STR."""
                Numbers to multiply: \{values}
                Result: \{multiply.get().compute(values.toArray(new Integer[0]))}""");

                case DIVIDE -> {
                    List<Double> doubleValues = new ArrayList<>();
                    values.forEach(value -> doubleValues.add(value.doubleValue()));
                    System.out.println(STR."""
                Numbers to divide: \{values}
                Result: \{divide.compute(doubleValues.toArray(new Double[0]))}""");
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

