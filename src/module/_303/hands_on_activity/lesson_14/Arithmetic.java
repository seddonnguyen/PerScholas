package module._303.hands_on_activity.lesson_14;

import java.util.stream.Stream;

public interface Arithmetic {
    Calc<Integer, Integer> add = new Calc<>() {
        @Override
        public Integer compute(Integer[] values) {
            return Stream.of(values).reduce(Integer::sum).orElse(0);
        }
    };

    Calc<Integer, Integer> subtract = values -> Stream.of(values).reduce((a, b) -> a - b).orElse(0);

    Calc<Integer, Integer> multiply = values -> Stream.of(values).reduce((a, b) -> a * b).orElse(0);

    Calc<Integer, Double> divide = values -> {
        try {
            return calculateDivision(values);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    };

    private static Double calculateDivision(Integer[] values) throws Exception {
        if (values.length < 2) {
            throw new Exception("Division requires at least two numbers.");
        }
        if (values.length > 2) {
            throw new Exception("Division requires only two numbers.");
        }
        if (values[1] == 0) {
            throw new Exception("Cannot divide by zero.");
        }
        return Stream.of(values).map(Integer::doubleValue).reduce((a, b) -> a / b).orElse(0.0);
    }
}
