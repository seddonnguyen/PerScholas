package module._303.hands_on_activity.lesson_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import static module._303.hands_on_activity.lesson_14.Prompt.*;

public abstract class MainEntry {

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");

        try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                runCalculator(reader);
            } while (continueOperation(reader));
        } catch (Exception e) {
            System.out.println(STR."An error occurred. \{e.getMessage()}");
        }
        System.out.println("Goodbye!");
    }

    private static void runCalculator(BufferedReader reader) {
        try {
            var numbers = getIntegers(reader);
            if (numbers.length == 0) {
                return;
            }
            var operation = getOperation(reader);
            var results = operation.getOperation().compute(numbers);
            System.out.println(formatEquation(numbers, operation.getSymbol(), results));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static String formatEquation(Integer[] numbers, String symbol, Number results) {
        var equation = Arrays.toString(numbers).replaceAll("[\\[\\]]", "").replaceAll(", ", STR." \{symbol} ");
        return STR."\{equation} = \{results}";
    }
}