package module._303.hands_on_activity.lesson_14;

import java.util.List;
import java.util.Objects;

public class Multiplication implements Calc {
    private static final String SYMBOL = "*";
    private static final Multiplication INSTANCE = new Multiplication();

    private Multiplication() {
    }

    public static Multiplication getInstance() {
        return INSTANCE;
    }

    @Override
    public <T extends Number> Number calculate(List<T> values) {
        if (values == null) {
            throw new NullPointerException("Multiplication requires non-null operands");
        }

        if (values.stream().anyMatch(Objects::isNull)) {
            throw new NullPointerException("Multiplication requires non-null operands");
        }

        if (values.size() < 2) {
            throw new IllegalArgumentException("Multiplication requires at least two operands");
        }

        return values.stream()
                .mapToDouble(Number::doubleValue)
                .reduce((a, b) -> a * b)
                .orElse(0);
    }

    @Override
    public String toString() {
        return SYMBOL;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Multiplication;
    }

    @Override
    public int hashCode() {
        return SYMBOL.hashCode();
    }
}
