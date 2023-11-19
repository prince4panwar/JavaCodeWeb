
import java.util.Arrays;

class program88
{  
    public static void main(String[] args) 
    {   
        System.out.println("\n Program to reverse an array of integer values."); 
        int [] arr = {11, 12, 13, 14, 15, 16, 17};  
        System.out.print("\n Original array: ");

        for (int i = 0; i < arr.length; i++)
        {  
            System.out.print( arr[i] + " ");  
        }    
        System.out.print("\n Reverse a Array values : ");  
         
        for (int i = arr.length-1; i >= 0; i--) 
        { 
            System.out.print( arr[i] + " ");  
        }  
    }  
}  