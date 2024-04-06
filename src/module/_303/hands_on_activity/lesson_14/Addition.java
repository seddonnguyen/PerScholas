package module._303.hands_on_activity.lesson_14;

import java.util.List;
import java.util.Objects;

public class Addition implements Calc {
    private static final String SYMBOL = "+";
    private static final Addition INSTANCE = new Addition();

    private Addition() {
    }

    public static Addition getInstance() {
        return INSTANCE;
    }

    @Override
    public <T extends Number> Number calculate(List<T> values) {
        if (values == null) {
            throw new NullPointerException("Addition requires non-null operands");
        }

        if (values.stream().anyMatch(Objects::isNull)) {
            throw new NullPointerException("Addition requires non-null operands");
        }

        if (values.size() < 2) {
            throw new IllegalArgumentException("Addition requires at least two operands");
        }

        return values.stream()
                .mapToDouble(Number::doubleValue)
                .sum();
    }

    @Override
    public String toString() {
        return SYMBOL;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Addition;
    }

    @Override
    public int hashCode() {
        return SYMBOL.hashCode();
    }
}
