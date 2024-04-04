package module._303.pa._7._1;

import java.util.Arrays;
public class Task6 {
    public static void main(String[] args) {
        /*
        Task 6: Write a program where you create an integer array of 5 numbers.
        Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
         */
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
