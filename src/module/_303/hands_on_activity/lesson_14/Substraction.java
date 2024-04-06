package module._303.hands_on_activity.lesson_14;

import java.util.List;
import java.util.Objects;

public class Substraction implements Calc {
    private static final String SYMBOL = "-";
    private static final Substraction INSTANCE = new Substraction();

    private Substraction() {
    }

    public static Substraction getInstance() {
        return INSTANCE;
    }

    @Override
    public <T extends Number> Number calculate(List<T> values) {
        if (values == null) {
            throw new NullPointerException("Subtraction requires non-null operands");
        }

        if (values.stream().anyMatch(Objects::isNull)) {
            throw new NullPointerException("Subtraction requires non-null operands");
        }

        if (values.size() < 2) {
            throw new IllegalArgumentException("Subtraction requires at least two operands");
        }

        return values.stream()
                .mapToDouble(Number::doubleValue)
                .reduce((a, b) -> a - b)
                .orElse(0);
    }

    @Override
    public String toString() {
        return SYMBOL;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Substraction;
    }

    @Override
    public int hashCode() {
        return SYMBOL.hashCode();
    }
}
