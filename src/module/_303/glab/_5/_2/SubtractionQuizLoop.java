package module._303.glab._5._2;

import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
/*
        Example #2: An Advanced Math Tool
        Write a program that generates five single-digit integer subtraction problems.
        Using a while loop, prompt the user to answer all five problems.
        After all of the answers are entered, report the number of the correct answers.
        Offer the user the opportunity to play the game again.
*/
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        StringBuilder output = new StringBuilder();
        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
            }
            count++;
            output.append("\n").append(number1).append(" - ").append(number2).append(" = ").append(answer).append((number1 - number2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds" + output);
    }
}
