
import java.util.Scanner;

class program87
{
    public static void main(String[] args) 
    {
        System.out.println("\n program to insert an element (specific position) into an array");
        int n, position, x;
        Scanner s = new Scanner(System.in);
        System.out.print("\n Enter no. of elements you want in array : ");
        n = s.nextInt();
        int arr[] = new int[n+1];
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(" Enter all the elements : ");
            arr[i] = s.nextInt();
        }
        System.out.print("\n Enter the position where you want to insert element : ");
        position = s.nextInt();
        System.out.print("\n Enter the element you want to insert : ");
        x = s.nextInt();
            
        for(int i = (n-1); i >= (position-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[position-1] = x;
        System.out.print("\n After inserting : ");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println(arr[n]);
    }
}
 