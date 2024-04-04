package module._303.pa._5._1;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Task 1: Print a Multiplication Table
        System.out.printf("%16sMultiplication Table%n", " ");
        int size = 12;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
