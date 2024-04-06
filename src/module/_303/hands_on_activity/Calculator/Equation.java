package module._303.hands_on_activity.Calculator;

import java.util.List;
import java.util.StringJoiner;

public interface Equation {
    static String toString(List<? extends Number> numbers, Arithmetic operation) {
        if (numbers.isEmpty()) { return ""; }

        var results = operation.getOperation().compute(numbers);
        var list = numbers.stream().map(Object::toString).toList();
        return STR."\{buildString(list, operation.getSymbol())} = \{results}"; // results is not defined
    }

    private static String buildString(List<String> list, String delimiter) {
        StringJoiner stringJoiner = new StringJoiner(STR." \{delimiter} ");

        if (list.size() == 1) { return list.getFirst(); }
        if (list.size() == 2) { return STR."\{list.get(0)} \{delimiter} \{list.get(1)}"; }

        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size()) {
                stringJoiner.add(STR."(\{list.get(i)} \{delimiter} \{list.get(++i)})");
            } else {
                stringJoiner.add(list.get(i));
            }
        }
        return stringJoiner.toString();
    }
}