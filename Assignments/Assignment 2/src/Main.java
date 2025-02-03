import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int e = 0;
        if (scanner.hasNextInt()){
            e = scanner.nextInt();
        }

        if (e > 20){
            System.out.println("You can only enter up to 20 numbers. ");
            return;

        }

        int[] array = new int[e];
        int sum = 0;

        System.out.print("Enter "+ e +" numbers: ");
        for (int i =0; i < e; i++) {
            if (scanner.hasNextInt()) {
                array[i]= scanner.nextInt();
                sum += array[i];
            }
        }

        System.out.print("Array Elements: ");
        for (int i = 0; i < e; i++){
            System.out.print(array[i] + " ");
        }

        int largest = array[0];
        int smallest = array[0];


        for (int num : array) {

            if (num> largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }

        double avg = (double) sum /array.length;
        System.out.println();
        System.out.println("Largest Number: "+largest);
        System.out.println("Smallest Number: "+smallest);
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);

        System.out.print("Enter a number to search: ");
        int numberToSearch= scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < e; i++) {
            if (array[i] == numberToSearch) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(numberToSearch+" is found in the array. ");
        } else {
            System.out.println(numberToSearch+" is not found in the array. ");
        }

        bubbleSort(array);
        System.out.print("Sorted Array: ");
        for(int num : array){
            System.out.print(num+ " ");
        }


    }

    public static void bubbleSort(int[]array){
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; i++){
                if(array[j] > array[j + 1]){

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}