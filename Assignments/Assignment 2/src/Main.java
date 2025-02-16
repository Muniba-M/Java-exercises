import java.util.Scanner; // Importing the Scanner class to take user input

public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Asking the user for the number of elements to be entered
        System.out.print("Enter the number of elements: ");
        int e;

        // Check if the input is a valid integer
        if (scanner.hasNextInt()) {
            e = scanner.nextInt();

            // Limit the number of elements to 20
            if (e > 20) {
                System.out.println("You can only enter up to 20 numbers. Setting size to 20.");
                e = 20; // Adjust the number of elements if user exceeds the limit
            }

            // Declare an array to store the input numbers
            int[] array = new int[e];
            int sum = 0;

            // Ask the user to input the numbers
            System.out.print("Enter " + e + " numbers: ");
            for (int i = 0; i < e; i++) {
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    sum += array[i]; // Add each number to the sum
                } else {
                    System.out.println("Invalid input. Exiting.");
                    scanner.close();
                    return; // Exit if input is invalid
                }
            }

            // Display the array elements
            System.out.print("Array Elements: ");
            for (int i = 0; i < e; i++) {
                System.out.print(array[i] + " ");
            }

            // Find the largest and smallest numbers in the array
            if (e > 0) {
                int largest = array[0];
                int smallest = array[0];

                // Loop through the array to find the largest and smallest numbers
                for (int num : array) {
                    if (num > largest) {
                        largest = num;
                    } else if (num < smallest) {
                        smallest = num;
                    }
                }

                // Calculate the average of the numbers
                double avg = (double) sum / array.length;
                System.out.println();
                System.out.println("Largest Number: " + largest);
                System.out.println("Smallest Number: " + smallest);
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + avg);
            }

            // Ask the user to enter a number to search in the array
            System.out.print("Enter a number to search: ");
            int numberToSearch = scanner.nextInt();

            // Check if the number is present in the array
            boolean found = false;
            for (int i = 0; i < e; i++) {
                if (array[i] == numberToSearch) {
                    found = true;
                    break;
                }
            }

            // Display whether the number was found or not
            if (found) {
                System.out.println(numberToSearch + " is found in the array.");
            } else {
                System.out.println(numberToSearch + " is not found in the array.");
            }

            // Perform Bubble Sort to sort the array in ascending order
            bubbleSort(array);

            // Display the sorted array
            System.out.println("Sorted Array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }

        } else {
            System.out.println("Invalid input. Exiting.");
            scanner.close();
            return; // Exit if the user input is not valid
        }

        // Close the scanner
        scanner.close();
    }

      // The bubbleSort method sorts an array using the Bubble Sort algorithm.
     // Bubble Sort works by repeatedly stepping through the list, comparing adjacent elements,
    // and swapping them if they are in the wrong order.
    // This process is repeated until the array is sorted.

    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Loop over the array n-1 times to ensure all elements are sorted
        for (int i = 0; i < n - 1; i++) {
            // For each pass, compare adjacent elements and swap if necessary
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
