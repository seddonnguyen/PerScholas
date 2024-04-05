package module._303.hands_on_activity.lesson_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static module._303.hands_on_activity.lesson_14.Prompt.*;

public abstract class MainEntry {

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
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

            var arithmeticOperation = getOperation(reader);
            System.out.println(arithmeticOperation.toString(numbers, arithmeticOperation.calculate(numbers)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}