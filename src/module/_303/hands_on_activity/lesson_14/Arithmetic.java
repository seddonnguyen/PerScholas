package module._303.hands_on_activity.lesson_14;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Arithmetic {
    ADD(Addition.SYMBOL, Addition.operation),
    SUBTRACT(Subtraction.SYMBOL, Subtraction.operation),
    MULTIPLY(Multiplication.SYMBOL, Multiplication.operation),
    DIVIDE(Division.SYMBOL, Division.operation),
    MODULO(Modulo.SYMBOL, Modulo.operation);
    
    private static final Map<Integer, Arithmetic> INDEX_MAP = Stream.of(values())
                                                                    .collect(Collectors.toMap(Arithmetic::getIndex, Function.identity()));

    private final String symbol;
    private final Calculate operation;

    Arithmetic(String symbol, Calculate operation) {
        this.operation = operation;
        this.symbol = symbol;
    }

    public static Arithmetic valueOf(int index) {
        return INDEX_MAP.get(index);
    }

    public int getIndex() {
        return ordinal() + 1;
    }

    public Calculate getOperation() { return operation; }

    public String getSymbol() {
        return symbol;
    }

    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}