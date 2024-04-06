package module._303.hands_on_activity.Calculator;

import java.util.Objects;

public interface Multiplication {
    String SYMBOL = "*";

    Calculate operation = numbers -> {
        if (numbers == null) {
            throw new NullPointerException("Multiplication requires non-null operands");
        }

        if (numbers.stream().anyMatch(Objects::isNull)) {
            throw new NullPointerException("Multiplication requires non-null operands");
        }

        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Multiplication requires at least two operands");
        }

        if (numbers.stream().anyMatch(number -> number instanceof Double)) {
            return numbers.stream().mapToDouble(Number::doubleValue).reduce((a, b) -> a * b).orElse(0);
        }
        return numbers.stream().mapToInt(Number::intValue).reduce((a, b) -> a * b).orElse(0);
    };
}