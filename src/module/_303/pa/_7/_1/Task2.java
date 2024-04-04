package module._303.pa._7._1;

public class Task2 {
    public static void main(String[] args) {
        /*
        Task 2: Write a program that returns the middle element in an array.
        Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
        */
        int[] arr = {13, 5, 7, 68, 2};
        int middle = arr.length / 2;
        System.out.println(arr[middle]);
    }
}
