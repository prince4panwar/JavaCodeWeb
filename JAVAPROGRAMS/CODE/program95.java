
import java.util.Arrays;

class program95
{
    public static void main(String a[])
    {
        System.out.println("\n Program to find the number of even and odd integers in a given array of integers");
        int arr[]={1,2,5,6,3,2}; 
        System.out.println("\n Arrays : "+Arrays.toString(arr));
        System.out.println(" ");

        System.out.print(" Odd Numbers : ");  
        for(int i=0;i<arr.length;i++)
        {  
        if(arr[i] % 2 != 0)
        {  
        System.out.print(arr[i] + " ");  
        }  
        }  
        System.out.print("\n Even Numbers : ");  
        for(int i=0;i<arr.length;i++)
        {  
        if(arr[i] % 2 == 0)
        {  
        System.out.print(arr[i] + " ");  
        }  
        }  
    }  

}
