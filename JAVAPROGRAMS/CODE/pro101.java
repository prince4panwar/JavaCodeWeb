import java.util.Arrays;
import java.util.Collections;

class DescendingOrder 
{

    public static void main(String[] args) 
    {
        System.out.println("\nProgram to Sort the Array in an Descending Order.\n");
        Integer[] arr = {10, 4, 7, 9, 2, 6, 3, 8, 5, 1};
        System.out.println("Orginal Array : "+Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("Sorted array in descending order is : ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
}
    } 