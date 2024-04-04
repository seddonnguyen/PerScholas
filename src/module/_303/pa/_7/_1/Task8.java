package module._303.pa._7._1;

public class Task8 {
    public static void main(String[] args) {
        /*
        Task 8: Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
         */
        String[] arr = {"A", "B", "C", "D", "E"};
        String temp = arr[0];
        arr[0] = arr[arr.length / 2];
        arr[arr.length / 2] = temp;
        for (String s : arr) {
            System.out.println(s);
        }
        
    }
}
