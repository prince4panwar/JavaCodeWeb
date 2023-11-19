
import java.util.Arrays;

class program98
{  
    public static void main(String[] args) 
    {   
        System.out.println("\n Program to cyclically rotate a given array clockwise by one"); 
        int [] arr = {10, 20, 30, 40, 50, 60, 70};  
        System.out.print("\n Original array: ");

        for (int i = 0; i < arr.length; i++)
        {  
            System.out.print( arr[i] + " ");  
        }    
        System.out.print("\n Rotate  a Array values : ");  
         
        for (int i = arr.length-1; i >= 0; i--) 
        { 
            System.out.print( arr[i] + " ");  
        }  
    }  
} 