package module._303.hands_on_activity.lesson_14;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public enum Arithmetic {
    ADD(MathSymbol.PLUS) {
        public Integer calculate(Integer[] numbers) {
            Calc<Integer, Integer> add = values -> Stream.of(values).reduce(Integer::sum).orElse(0);
            return add.compute(numbers);
        }
    }, SUBTRACT(MathSymbol.MINUS) {
        public Integer calculate(Integer[] numbers) {
            Calc<Integer, Integer> subtract = values -> Stream.of(values).reduce((a, b) -> a - b).orElse(0);
            return subtract.compute(numbers);
        }
    }, MULTIPLY(MathSymbol.MULTIPLY) {
        public Integer calculate(Integer[] numbers) {
            Calc<Integer, Integer> multiply = values -> Stream.of(values).reduce((a, b) -> a * b).orElse(0);
            return multiply.compute(numbers);
        }
    }, DIVIDE(MathSymbol.DIVIDE) {
        public Double calculate(Integer[] numbers) {
            Calc<Integer, Double> divide = values -> {
                if (values.length < 2) {
                    throw new RuntimeException("Division requires at least two numbers.");
                }
                if (values.length > 2) {
                    throw new RuntimeException("Division requires only two numbers.");
                }
                if (values[1] == 0) {
                    throw new RuntimeException("Cannot divide by zero.");
                }
                return Stream.of(values).map(Integer::doubleValue).reduce((a, b) -> a / b).orElse(0.0);
            };
            return divide.compute(numbers);
        }
    };

    private final static Map<MathSymbol, Arithmetic> arithmeticMap = new HashMap<>();

    static {
        for (Arithmetic arithmetic : values()) {
            arithmeticMap.put(arithmetic.getSymbol(), arithmetic);
        }
    }

    private final MathSymbol symbol;

    Arithmetic(MathSymbol symbol) {
        this.symbol = symbol;
    }

    public static Arithmetic valueOf(MathSymbol symbol) {
        return arithmeticMap.get(symbol);
    }

    public static Arithmetic valueOf(int index) {
        return values()[index - 1];
    }

    public MathSymbol getSymbol() {
        return symbol;
    }

    public int getIndex() {
        return ordinal() + 1;
    }

    public String toString() {
        return super.name().charAt(0) + super.name().substring(1).toLowerCase();
    }

    public String toString(Integer[] numbers, Number result) {
        String equation = Stream.of(numbers).map(String::valueOf).reduce((a, b) -> STR."\{a} \{symbol.getSymbol()} \{b}").orElse("");
        return STR."\{equation} = \{result}";
    }

    public abstract Number calculate(Integer[] numbers);
}
