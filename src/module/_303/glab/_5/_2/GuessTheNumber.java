package module._303.glab._5._2;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
/*
        Example #1: Guess the Number
        Write a program that randomly generates an integer between 0 and 100, inclusive.
        The program should prompt the user to enter a number repeatedly until the number matches the randomly generated number.
        For each user input, the program tells the user whether the input is too low or too high.
        When the user discovers the correct answer, the program outputs a congratulatory message, and then provides the user with the opportunity to play again.
*/
        int randomNumber = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        int guess = -1;
        while (guess != randomNumber) {
            System.out.print("Enter a number between 0 and 100: ");
            guess = input.nextInt();
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number!");
                System.out.println("Would you like to play again? (yes/no)");
                String playAgain = input.next().toUpperCase();
                if (playAgain.equals("YES")) {
                    randomNumber = (int) (Math.random() * 101);
                    guess = -1;
                }
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
    }
}
