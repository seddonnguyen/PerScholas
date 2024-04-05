package module._303.hands_on_activity.lesson_14;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public enum ArithmeticOperation {
    ADD(Arithmetic.add, "+"),
    SUBTRACT(Arithmetic.subtract, "-"),
    MULTIPLY(Arithmetic.multiply, "*"),
    DIVIDE(Arithmetic.divide, "/");

    private final Calc operation;
    private final String symbol;

    ArithmeticOperation(Calc operation, String symbol) {
        this.operation = operation;
        this.symbol = symbol;
    }

    public static ArithmeticOperation valueOf(int index) {
        return values()[index - 1];
    }

    public Calc getOperation() {
        return operation;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getIndex() {
        return ordinal() + 1;
    }
}
