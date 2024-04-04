package module._303.pa._7._1;

public class Task7 {
    public static void main(String[] args) {
        /*
        Task 7: Write a program where you create an array of 5 elements.
        Loop through the array and print the value of each element, except for the middle (index 2) element.
         */
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (i != 2) {
                System.out.println(arr[i]);
            }
        }
    }
}
