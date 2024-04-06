package module._303.hands_on_activity.Calculator;

import java.util.List;
import java.util.Objects;

public interface Division {
    String SYMBOL = "/";

    Calculate operation = numbers -> {
        if (numbers == null) {
            throw new NullPointerException("Division requires non-null operands");
        }

        if (numbers.stream().anyMatch(Objects::isNull)) {
            throw new NullPointerException("Division requires non-null operands");
        }

        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Division requires at least two operands");
        }

        if (numbers.size() > 2) {
            throw new IllegalArgumentException("Division requires only two operands");
        }

        if (numbers.stream().skip(1).anyMatch(v -> v.intValue() == 0)) {
            throw new ArithmeticException("Division by zero");
        }

        List<Integer> intNumbers = numbers.stream().map(Number::intValue).toList();
        for (int i = 0; i < intNumbers.size() - 1; i++) {
            if (i + 1 < intNumbers.size() && intNumbers.get(i) % intNumbers.get(i + 1) != 0) {
                return numbers.stream().mapToDouble(Number::doubleValue).reduce((a, b) -> a / b).orElse(0);
            }
        }
        return intNumbers.stream().reduce((a, b) -> a / b).orElse(0);
    };
};