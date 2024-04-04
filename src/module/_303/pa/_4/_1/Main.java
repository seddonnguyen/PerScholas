package module._303.pa._4._1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static double calculateTax(double income, double... brackets) {
        double[] marginalTax = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        double tax = 0;
        if (income <= brackets[0]) {
            tax = income * marginalTax[0];
        } else if (income <= brackets[1]) {
            tax = brackets[1] * marginalTax[1];
        } else if (income <= brackets[2]) {
            tax = brackets[2] * marginalTax[2];
        } else if (income <= brackets[3]) {
            tax = brackets[3] * marginalTax[3];
        } else if (income <= brackets[4]) {
            tax = brackets[4] * marginalTax[4];
        } else {
            tax = brackets[5] * marginalTax[5];
        }
        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        1. Write a program that declares 1 integer variable x, and then assigns 7 to it.
        Write an if statement to print out “Less than 10” if x is less than 10.
        Change x to equal 15, and notice the result (console should not display anything).
*/
        System.out.println("Task 1:");
        int x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        x = 15;

/*
        2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
        Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10.
        Change x to 15 and notice the result.
*/
        System.out.println("Task 2:");
        x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
        x = 15;

/*
        Write a program that declares 1 integer variable x, and then assigns 15 to it.
        Write an if-else-if statement that prints out “Less than 10” if x is less than 10.
        Print out “Between 10 and 20” if x is greater than 10 but less than 20.
        Print out “Greater than or equal to 20” if x is greater than or equal to 20.
        Change x to 50 and notice the result.
*/
        System.out.println("Task 3:");
        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
        x = 50;

/*
        4. Write a program that declares 1 integer variable x, and then assigns 15 to it.
        Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).
        Change x to 5 and notice the result.
*/
        System.out.println("Task 4:");
        x = 15;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
        x = 5;

/*
        5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
            A: 90-100
            B: 80-89
            C: 70-79
            D: 60-69
            F: <60
           Use the Scanner class to accept a number score from the user to determine the letter grade.
           Print out “Score out of range” if the score is less than 0 or greater than 100.
*/
        System.out.println("Task 5:");
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        scanner.nextLine();
        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

/*
        6. Write a program that accepts an integer between 1 and 7 from the user.
        Use a switch statement to print out the corresponding weekday.
        Print “Out of range” if the number is less than 1 or greater than 7.
        Do not forget to include “break” statements in each of your cases.
*/
        System.out.println("Task 6:");
        System.out.print("Enter a number between 1 and 7: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }

/*
        7. Create a program that lets the users input their filing status and income.
        Display how much tax the user would have to pay according to status and income.
         - The U.S. federal personal income tax is calculated based on the filing status and taxable income.
         _ There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
         - The tax rates for 2009 are shown below.
*/
        System.out.println("Task 7:");
        String status = "";
        FilingStatus filingStatus = null;

        while (true) {
            try {
                System.out.print("Enter your filing status: ");
                status = scanner.nextLine().toUpperCase();
                filingStatus = FilingStatus.valueOf(status);
                break;
            } catch (IllegalArgumentException e) {
                List<String> filingStatuses = Arrays.stream(FilingStatus.values()).map(Enum::name).collect(Collectors.toList());
                System.out.printf("Invalid filing status. Please enter one of the following: %s%n", String.join(", ", filingStatuses));
            }
        }

        double income = 0;
        double tax = 0;
        while (true) {
            System.out.println("Enter your income: ");
            income = scanner.nextDouble();
            scanner.nextLine();
            if (income >= 0) {
                break;
            }
            System.out.println("Income cannot be negative. Please enter a valid income.");
        }

        tax = switch (filingStatus) {
            case SINGLE -> calculateTax(income, 8350, 33950, 82250, 171550, 372950);
            case MARRIED_FILING_JOINTLY -> calculateTax(income, 16700, 67900, 137050, 208850, 372950);
            case MARRIED_FILING_SEPARATELY -> calculateTax(income, 8350, 33950, 68525, 104425, 186475);
            case HEAD_OF_HOUSEHOLD -> calculateTax(income, 11950, 45500, 117450, 190200, 372950);
        };

        System.out.printf("Your tax is: $%.2f%n", tax);
    }

    enum FilingStatus {
        SINGLE, MARRIED_FILING_JOINTLY, MARRIED_FILING_SEPARATELY, HEAD_OF_HOUSEHOLD
    }
}
