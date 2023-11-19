
import java.util.Scanner;

class program86
{
    public static void main(String a[]) 
    {
        System.out.println("\n program to find the maximum and minimum value of an array");
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter Size of Array: ");
        int n = sc.nextInt();
        int i, sum = 0;
        int arr[] = new int[n];

        for (i = 0; i < n; i++) 
        { 
            System.out.print( " Enter a number : ");
            arr[i] = sc.nextInt();
        }

        int max_element = arr[0];
        int min_element = arr[0];

        for (i = 0; i < n; i++) 
        {
            if (arr[i] > max_element) 
            { 
                max_element = arr[i];
            }

            if (arr[i] < min_element) 
            {
                min_element = arr[i];
            }
        }

        System.out.println("\n Maximum value of array is : " + max_element);
        System.out.println("\n Minimum value of array is : " + min_element);
    }
}