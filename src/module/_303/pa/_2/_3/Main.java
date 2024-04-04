package module._303.pa._2._3;

public class Main {
    public static void main(String[] args) {
        /*
            Write a program that declares an integer a variable x, assigns the value 2 to it, and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
            Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
            Before printing the results, write a comment with the predicted decimal value and binary string.
            Now, print out x in decimal form and in binary notation.
            Perform the preceding exercise with the following values:
            a. 9
            b. 17
            c. 88
        */
        System.out.println("Task 1:");
        int x = 2;
        System.out.println("Binary string version of the number: " + Integer.toBinaryString(x));
        x = x << 1;
        // Predicted decimal value: 4
        // Predicted binary string: 100
        System.out.println("x in decimal form: " + x);
        System.out.println("x in binary notation: " + Integer.toBinaryString(x));
        // a. 9
        x = 9;
        System.out.println("Binary string version of the number: " + Integer.toBinaryString(x));
        x = x << 1;
        // Predicted decimal value: 18
        // Predicted binary string: 10010
        System.out.println("x in decimal form: " + x);
        System.out.println("x in binary notation: " + Integer.toBinaryString(x));
        // b. 17
        x = 17;
        System.out.println("Binary string version of the number: " + Integer.toBinaryString(x));
        x = x << 1;
        // Predicted decimal value: 34
        // Predicted binary string: 100010
        System.out.println("x in decimal form: " + x);
        System.out.println("x in binary notation: " + Integer.toBinaryString(x));
        // c. 88
        x = 88;
        System.out.println("Binary string version of the number: " + Integer.toBinaryString(x));
        x = x << 1;
        // Predicted decimal value: 176
        // Predicted binary string: 10110000
        System.out.println("x in decimal form: " + x);
        System.out.println("x in binary notation: " + Integer.toBinaryString(x));

        /*
            Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string version of the number.
            Now use the right shift operator (>>) to shift by 2 and assign the result to x.
            Write a comment indicating what you anticipate the decimal and binary values to be.
            Now print the value of x and the binary string.
            Perform the preceding exercise with the following values:
            a. 225
            b. 1555
            c. 32456
        */
        System.out.println("Task 2:");
        x = 150;
        System.out.println("Binary string version of the number: " + Integer.toBinaryString(x));
        x = x >> 2;
        // Predicted decimal value: 37
        // Predicted binary string: 100101
        System.out.println("x in decimal form: " + x);
        System.out.println("x in binary notation: " + Integer.toBinaryString(x));
        // a. 225
        x = 225;
        System.out.println("Binary string version of the number: " + Integer.toBinaryString(x));
        x = x >> 2;
        // Predicted decimal value: 56
        // Predicted binary string: 111000
        System.out.println("x in decimal form: " + x);
        System.out.println("x in binary notation: " + Integer.toBinaryString(x));
        // b. 1555
        x = 1555;
        System.out.println("Binary string version of the number: " + Integer.toBinaryString(x));
        x = x >> 2;
        // Predicted decimal value: 388
        // Predicted binary string: 110000100
        System.out.println("x in decimal form: " + x);
        System.out.println("x in binary notation: " + Integer.toBinaryString(x));
        // c. 32456
        x = 32456;
        System.out.println("Binary string version of the number: " + Integer.toBinaryString(x));
        x = x >> 2;
        // Predicted decimal value: 8114
        // Predicted binary string: 111111010010
        System.out.println("x in decimal form: " + x);
        System.out.println("x in binary notation: " + Integer.toBinaryString(x));

        /*
            Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
            Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
            Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
         */
        System.out.println("Task 3:");
        x = 7;
        int y = 17;
        // Predicted result of the bitwise and operation on x and y: 1
        int z = x & y;
        System.out.println("z in decimal form: " + z);
        System.out.println("z in binary notation: " + Integer.toBinaryString(z));

        /*
            Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
            As before, write a comment that indicates what you predict the values to be before printing them out.
         */
        System.out.println("Task 4:");
        z = x | y;
        // Predicted result of the bitwise or operation on x and y: 23
        System.out.println("z in decimal form: " + z);
        System.out.println("z in binary notation: " + Integer.toBinaryString(z));

        /*
            Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value.
            Print the value before and after the increment operator.
         */
        System.out.println("Task 5:");
        int numTask5 = 15;
        System.out.println("Value before the increment operator: " + numTask5);
        numTask5++;
        System.out.println("Value after the increment operator: " + numTask5);

        /*
            Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
            Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
         */
        System.out.println("Task 6:");
        int numTask6 = 15;
        System.out.println("Value before the increment operator: " + numTask6);
        numTask6++;
        System.out.println("Value after the increment operator: " + numTask6);
        numTask6 += 1;
        System.out.println("Value after the increment operator: " + numTask6);
        numTask6 = numTask6 + 1;
        System.out.println("Value after the increment operator: " + numTask6);

        /*
            Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
            Create another variable sum and assign the value of ++x added to y, and print the result.
            Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program.
            Notice what the value of the sum is. The first configuration incremented x, and then calculated the sum, while the second configuration calculated the sum, and then incremented x.
         */
        System.out.println("Task 7:");
        x = 5;
        y = 8;
        int sum = ++x + y;
        System.out.println("The value of the sum: " + sum);
        x = 5;
        y = 8;
        sum = x++ + y;
        System.out.println("The value of the sum: " + sum);
    }
}