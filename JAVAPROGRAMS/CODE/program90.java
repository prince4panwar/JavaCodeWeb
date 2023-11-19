
import java.util.Arrays;

class program90

{  
    public static void main(String[] args) 
    {
        System.out.println("\n Program to find the duplicate values of an array of integer values");    
        int [] arr = {11, 12, 13, 23, 11, 23, 90, 12};   
        System.out.println("\n Original Array : "+Arrays.toString(arr));   
        System.out.print(" Duplicate elements in given array: ");  

        for(int i = 0; i < arr.length; i++) 
        {  
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])
                {
                    System.out.print(arr[j] + " ");  
                }
            }     
        } System.out.println(" "); 
    }  
}
  