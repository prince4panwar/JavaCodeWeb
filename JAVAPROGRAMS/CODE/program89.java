
import java.util.Arrays;

class program89
{
       public static void main(String[] args) 
       {
          System.out.println("\n Program to find the common elements between two arrays");
          int[] arr1 = {11, 34, 66, 78, 23, 60};
          int[] arr2 = {66, 60, 70, 80, 11, 90};
 
       System.out.println("\n Original Array1 : "+Arrays.toString(arr1));
       System.out.println("\n Original Array2 : "+Arrays.toString(arr2));
       System.out.println(" ");
 
      System.out.print(" Array1 and Array2 are Common element is : ");
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == (arr2[j]))
                {
                 
                 System.out.print(arr1[i] + " ");
                 }
            }
        }System.out.println(" ");
 
    }
}