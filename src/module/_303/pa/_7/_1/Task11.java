import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        /*
        Task 11: Write some Java code that asks the user how many favorite things they have.
        Based on their answer, you should create a String array of the correct size.
        Then ask the user to enter the things and store them in the array you created.
        Finally, print out the contents of the array.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many favorite things do you have? ");
        int num = scanner.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter your favorite thing #" + (i + 1) + ": ");
            arr[i] = scanner.next();
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
