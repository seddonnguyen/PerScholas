package module._303.hands_on_activity.lesson_14;

import java.util.HashMap;
import java.util.Map;

public enum MathSymbol {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private static final Map<String, MathSymbol> mathSymbolMap = new HashMap<>();

    static {
        for (MathSymbol mathSymbol : values()) {
            mathSymbolMap.put(mathSymbol.getSymbol(), mathSymbol);
        }
    }

    private final String mathSymbol;

    MathSymbol(String mathSymbol) {
        this.mathSymbol = mathSymbol;
    }

    public static MathSymbol getMathSymbol(String symbol) {
        return mathSymbolMap.get(symbol);
    }

    public String getSymbol() {
        return mathSymbol;
    }
}
