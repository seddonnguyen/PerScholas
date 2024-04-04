package module._303.pa._7._1;

import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
        /* Task 5: Write a program where you create an integer array with a length of 5.
        Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
         */
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
