//Program to sort the elements of an array in ascending order
import java.util.Arrays;
 class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arrayWithDuplicates = {1, 2, 3, 4, 2, 3, 5, 6, 1};

        // Sorting the array to bring duplicate elements together
        Arrays.sort(arrayWithDuplicates);

        int[] tempArray = new int[arrayWithDuplicates.length];
        int j = 0;

        // Loop to traverse the sorted array
        for (int i = 0; i < arrayWithDuplicates.length - 1; i++) {
            if (arrayWithDuplicates[i] != arrayWithDuplicates[i + 1]) {
                tempArray[j++] = arrayWithDuplicates[i];
            }
        }

        tempArray[j++] = arrayWithDuplicates[arrayWithDuplicates.length - 1];

        // Copying only distinct elements to original array
        int[] arrayWithUniqueElements = new int[j];
        System.arraycopy(tempArray, 0, arrayWithUniqueElements, 0, j);

        // Displaying the array without duplicates
        System.out.println("Array with duplicates removed:");
        for (int num : arrayWithUniqueElements) {
            System.out.print(num + " ");
        }
    }
}
