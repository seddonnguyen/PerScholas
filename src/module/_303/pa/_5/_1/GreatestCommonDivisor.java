package module._303.pa._5._1;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
/*
        Task 2: Find the Greatest Common Divisor.
        Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
        - Name the two input integers n1 and n2.
        - You know number 1 is a common divisor, but it may not be the gcd.
        - Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
 */
        // How do you find the gcd?
        // To find GCD, I used a while loop to find the largest k that is a common divisor for n1 and n2.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first positive integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second positive integer: ");
        int n2 = input.nextInt();
        int gcd = 1;
        int k = 2;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
