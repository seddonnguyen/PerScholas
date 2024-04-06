package module._303.hands_on_activity.lesson_14;

import java.util.List;
import java.util.Objects;

public class Division implements Calc {
    private static final String SYMBOL = "/";
    private static final Division INSTANCE = new Division();

    private Division() {
    }

    public static Division getInstance() {
        return INSTANCE;
    }

    @Override
    public <T extends Number> Number calculate(List<T> values) {
        if (values == null) {
            throw new NullPointerException("Division requires non-null operands");
        }

        if (values.stream().anyMatch(Objects::isNull)) {
            throw new NullPointerException("Division requires non-null operands");
        }

        if (values.size() < 2) {
            throw new IllegalArgumentException("Division requires at least two operands");
        }

        if (values.stream().skip(1).anyMatch(v -> v.doubleValue() == 0)) {
            throw new ArithmeticException("Division by zero");
        }

        return values.stream()
                .mapToDouble(Number::doubleValue)
                .reduce((a, b) -> a / b)
                .orElse(0);
    }

    @Override
    public String toString() {
        return SYMBOL;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Division;
    }

    @Override
    public int hashCode() {
        return SYMBOL.hashCode();
    }
}
