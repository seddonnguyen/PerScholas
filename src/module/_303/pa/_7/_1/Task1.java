package module._303.pa._7._1;

public class Task1 {
    public static void main(String[] args) {
        /*
        Task 1: Write a program that creates an array of integers with a length of 3.
        Assign the values 1, 2, and 3 to the indexes. Print out each array element.
        */
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for(int n : arr) {
            System.out.println(n);
        }
    }
}