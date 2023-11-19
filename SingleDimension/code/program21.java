//Program to Remove Duplicate Element in an array
import java.util.Arrays;

class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Sorting the array in ascending order
        Arrays.sort(numbers);

        // Displaying the sorted array
        System.out.println("Sorted Array in Ascending Order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
