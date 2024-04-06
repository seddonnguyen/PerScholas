package module._303.hands_on_activity.Calculator;

import java.util.Objects;

public interface Modulo {
    String SYMBOL = "%";

    Calculate operation = numbers -> {
        if (numbers == null) {
            throw new NullPointerException("Modulo requires non-null operands");
        }

        if (numbers.stream().anyMatch(Objects::isNull)) {
            throw new NullPointerException("Modulo requires non-null operands");
        }

        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Modulo requires at least two operands");
        }

        if (numbers.size() > 2) {
            throw new IllegalArgumentException("Modulo requires exactly two operands");
        }

        if (numbers.stream().anyMatch(number -> number instanceof Double)) {
            throw new IllegalArgumentException("Modulo requires integer operands");
        }

        if (numbers.stream().skip(1).anyMatch(v -> v.intValue() == 0)) {
            throw new ArithmeticException("Modulo by zero");
        }
        return numbers.stream().mapToInt(Number::intValue).reduce((a, b) -> a % b).orElse(0);
    };
}