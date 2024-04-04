package module._303.hands_on_activity.lesson_14;

import java.util.*;
import java.util.function.Supplier;

public abstract class MainEntry {
    public static Calc add = new Calc() {
        @Override
        public int compute(Integer[] values) {
            var numbers = List.of(values);
            return numbers.stream().mapToInt(Integer::intValue).sum();
        }
    };
    public static Calc subtract = values -> {
        var numbers = List.of(values);
        return numbers.stream().mapToInt(Integer::intValue).reduce((a, b) -> a - b).orElse(0);
    };
    public static Supplier<Calc> multiply = () -> values -> {
        var numbers = List.of(values);
        return numbers.stream().mapToInt(Integer::intValue).reduce((a, b) -> a * b).orElse(0);
    };
    public static Calc divide = values -> {
        try {
            return calculateDivision(values);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    };

    private static int calculateDivision(Integer[] values) throws Exception {
        var numbers = List.of(values);
        if (numbers.size() < 2) {
            throw new Exception("Division requires at least two numbers.");
        }
        if (numbers.size() > 2) {
            throw new Exception("Division requires only two numbers.");
        }
        if (numbers.get(1) == 0) {
            throw new Exception("Cannot divide by zero.");
        }
        return numbers.stream().mapToInt(Integer::intValue).reduce((a, b) -> a / b).orElse(0);
    }

    private static List<Integer> getNumbers(Scanner scanner) {
        var values = new ArrayList<Integer>();
        boolean isDone = false;
        do {
            System.out.println("Enter a number or type 'done' to finish: ");
            String[] input = scanner.nextLine().split(" ");
            input = Arrays.stream(input).filter(value -> !value.isBlank()).toArray(String[]::new);
            try {
                for (String value : input) {
                    if (value.equalsIgnoreCase("done")) {
                        isDone = true;
                        break;
                    }
                    values.add(Integer.parseInt(value));
                }
            } catch (NumberFormatException e) {
                System.out.println(STR."Invalid input. \{e.getMessage()}. Try again.");
                System.out.println(STR."Current values: \{values}");
                continue;
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
                        4. Divide
                        5. Done""");
                operation = ArithmeticOperation.valueOf(scanner.nextInt());
                if (operation == null) {
                    System.out.println("Invalid operation. Try again.");
                    scanner.nextLine();
                    continue;
                } else {
                    isDone = true;
                    scanner.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Invalid operation. Try again.");
                scanner.nextLine();
                continue;
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
                continue;
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
                continue;
            }
        } while (!isDone);
        scanner.close();
    }

    private static void runCalculator(Scanner scanner) {
        try {
            List<Integer> values = getNumbers(scanner);
            ArithmeticOperation operation = getOperation(scanner);

            switch (operation) {
                case ADD -> System.out.println(STR."""
                Number to add: \{values}
                Result: \{add.compute(values.toArray(new Integer[0]))}""");

                case SUBTRACT -> System.out.println(STR."""
                Number to subtract: \{values}
                Result: \{subtract.compute(values.toArray(new Integer[0]))}""");

                case MULTIPLY -> System.out.println(STR."""
                Number to multiply: \{values}
                Result: \{multiply.get().compute(values.toArray(new Integer[0]))}""");

                case DIVIDE -> System.out.println(STR."""
                Number to divide: \{values}
                Result: \{divide.compute(values.toArray(new Integer[0]))}""");

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
            for (ArithmeticOperation operation : values()) {
                BY_VALUE.put(operation.value, operation);
            }
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

