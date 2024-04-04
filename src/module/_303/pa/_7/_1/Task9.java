package module._303.pa._7._1;

public class Task9 {
    public static void main(String[] args) {
        /*
        Task 9: Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        Print the array in ascending order, and print the smallest and the largest element of the array.
        The output will look like the following:
        - Array in ascending order: 0, 1, 2, 4, 9, 13
        - The smallest number is 0
        - The biggest number is 13
        */
        int[] arr = {4, 2, 9, 13, 1, 0};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // if the current element is greater than the next element, swap them
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Array in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("The smallest number is " + arr[0]);
        System.out.println("The biggest number is " + arr[arr.length - 1]);
    }
}
