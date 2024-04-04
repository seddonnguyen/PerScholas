package module._303.glab._5._1;

// Program to find the sum of natural numbers from 1 to 1000.
public class Main {
    public static void main(String[] args) {
        // Example 2: Display Sum of n Natural Numbers
        int sum = 0;
        int n = 1000;
        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }
}
