package module._303.hands_on_activity.lesson_14;

import java.util.List;

public interface Equation {
    static <T extends Number> String toString(List<T> numbers, Arithmetic operation) {
        if (numbers.isEmpty()) {
            return "";
        }

        var results = operation.getOperation().calculate(numbers);
        var expression = numbers.stream()
                .map(Number::toString)
                .reduce((a, b) -> STR."\{a} \{operation.getSymbol()} \{b}").orElse("");
        return STR."\{expression} = \{results}";
    }
}
