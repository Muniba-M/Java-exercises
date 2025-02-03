import java.util.Arrays;
import java.util.Scanner;

// Name: Muniba Maududi
// Date: 2/12/2025
// Description: In class exercise_functions

// Passing by value:
// When a variable is passed by value, a copy of the actual value is passed to the function.
// Changes made to the parameter inside the function do not affect the original value.

// Passing by reference:
// When a variable is passed by reference, the memory address (reference) of the original variable is passed to the function.
// Changes made to the parameter inside the function will directly affect the original variable.

public class Functions {
    public static void main(String[] args) {

        // Pass by Value
        int x = 5;
        System.out.println("Before calling increment: x = " + x);
        increment(x);
        System.out.println("After calling increment: x = " + x);

        // Pass by Reference
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println("Before calling modifyArray: " + Arrays.toString(arr));
        modifyArray(arr);
        System.out.println("After calling modifyArray: " + Arrays.toString(arr));

        // Function Demonstration: Swap Values
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("\nEnter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter two indices to swap: ");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        // Swap values and display the modified array
        swapValues(numbers, index1, index2);
        System.out.println("Array after swapping: " + Arrays.toString(numbers));

    }

    // Pass by Value Method
    static void increment(int num) {
        num = num + 10;
        System.out.println("Inside increment method: x = " + num);
    }

    // Pass by Reference Method
    static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
        System.out.println("Inside modifyArray: " + Arrays.toString(arr));
    }

    // Function to Swap Values
    static void swapValues(int[] arr, int i, int j) {
        if (i >= 0 && i < arr.length && j >= 0 && j < arr.length) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            System.out.println("Swapping successful!");
        } else {
            System.out.println("Invalid indices. Please enter values between 0 and " + (arr.length - 1));
        }
    }
}
