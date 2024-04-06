package module._303.hands_on_activity.lesson_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                runCalculator(reader);
            } while (Prompt.continueOperation(reader));
        } catch (Exception e) {
            System.out.println(STR."An error occurred. \{e.getMessage()}");
        }
        System.out.println("Goodbye!");
    }

    private static void runCalculator(BufferedReader reader) {
        try {
            var numbers = Prompt.getIntegers(reader);
            if (numbers.isEmpty()) { return; }

            Arithmetic arithmeticOperation = Prompt.getOperation(reader);
            System.out.println(Equation.toString(numbers, arithmeticOperation));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}