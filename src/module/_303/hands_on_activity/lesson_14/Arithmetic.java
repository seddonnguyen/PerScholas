package module._303.hands_on_activity.lesson_14;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Arithmetic {
    ADD("+", Addition.getInstance()),
    SUBTRACT("-", Substraction.getInstance()),
    MULTIPLY("*", Multiplication.getInstance()),
    DIVIDE("/", Division.getInstance()),
    MODULO("%", Modulo.getInstance());

    private static final Map<String, Arithmetic> SYMBOL_MAP = Stream.of(values())
            .collect(Collectors.toMap(Arithmetic::getSymbol, Function.identity()));
    private final String symbol;
    private final Calc operation;

    Arithmetic(String symbol, Calc operation) {
        this.operation = operation;
        this.symbol = symbol;
    }

    public static Arithmetic valueOf(int index) {
        return values()[index - 1];
    }

    public static Arithmetic fromSymbol(String symbol) {
        return SYMBOL_MAP.get(symbol);
    }

    public int getIndex() {
        return ordinal() + 1;
    }

    public Calc getOperation() {
        return operation;
    }

    public String getSymbol() {
        return symbol;
    }

    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
