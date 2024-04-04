package module._303.pa._2._1.com.perscholas.java_basic;

public class JavaBasicsClass {
    public static void main(String[] args) {
        /*
            Write a program that declares two integer variables, assigns an integer to each, and adds them together.
            Assign the sum to a variable.
            Print out the result.
         */
        System.out.println("Task 1:");
        int num1 = 8;
        int num2 = 7;
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        /*
            Write a program that declares two double variables, assigns a number to each, and adds them together.
            Assign the sum to a variable.
            Print out the result.
         */
        System.out.println("Task 2:");
        double num3 = 7.5;
        double num4 = 11.6;
        double sum2 = num3 + num4;
        System.out.println("The sum of " + num3 + " and " + num4 + " is " + sum2);

        /*
            Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
            Assign the sum to a variable.
            Print out the result.
            What variable type must the sum be? Double
         */
        System.out.println("Task 3:");
        int num5 = 7;
        double num6 = 11.5;
        double sum3 = num5 + num6;
        System.out.println("The sum of " + num5 + " and " + num6 + " is " + sum3);

        /*
            Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
            Assign the result to a variable.
            Print out the result.
            Now change the larger number to a decimal.
            What happens?
                The first result is an integer, the second result is a double.
            What corrections are needed?
                Type cast the larger number to a double, then divide so that the result is a double.
         */
        System.out.println("Task 4:");
        int num7 = 20;
        int num8 = 7;
        int result = num7 / num8;
        System.out.println("The result of " + num7 + " divided by " + num8 + " is " + result);
        double num9 = (double) num7;
        double result2 = num9 / num8;
        System.out.println("The result of " + num9 + " divided by " + num8 + " is " + result2);

        /*
            Write a program that declares two double variables, assigns a number to each, and divides the larger number by the smaller number.
            Assign the result to a variable, print it out, and then cast it to an integer.
            Print it out again.
         */
        System.out.println("Task 5:");
        double num10 = 20.5;
        double num11 = 7.5;
        double result3 = num10 / num11;
        System.out.println("The result of " + num10 + " divided by " + num11 + " is " + result3);
        int result4 = (int) result3;
        System.out.println("The result of " + num10 + " divided by " + num11 + " is " + result4);

        /*
            Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
            Declare a variable q and assign y/x to it and print q.
            Now, cast y to a double and assign it to q.
            Print q again.
         */
        System.out.println("Task 6:");
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println("q = " + q);
        // q = (double) y;
        // System.out.println("q = " + q);
        // Error: incompatible types: possible lossy conversion from double to int

        /*
            Write a program that declares a named constant and uses it in a calculation.
            Print the result.
        */
        System.out.println("Task 7:");
        final int CONSTANT = 7;
        int num12 = 13;
        int result5 = CONSTANT * num12;
        System.out.println("The result of " + CONSTANT + " multiplied by " + num12 + " is " + result5);

        /*
            Write a program where you create three variables that represent products at a cafe.
            The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
            Assign prices to each product.
            Create two more variables called subtotal and totalSale.
            Complete an “order” for three items of the first product, four items of the second product, and two items of the third product.
            Add them all together to calculate the subtotal.
            Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
            Be sure to format the results to two decimal places.
         */
        System.out.println("Task 8:");
        double coffee = 2.30;
        double cappuccino = 4.00;
        double espresso = 1.75;
        int coffeeQty = 3;
        int cappuccinoQty = 4;
        int espressoQty = 2;
        double subtotal = (coffee * coffeeQty) + (cappuccino * cappuccinoQty) + (espresso * espressoQty);
        final double SALES_TAX = 0.17;
        double totalSale = subtotal + (1 + SALES_TAX);
        System.out.printf("The subtotal is $%.2f and the total sale is $%.2f\n", subtotal, totalSale);
    }
}
