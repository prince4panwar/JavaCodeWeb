
import java.util.Arrays;

class program83
{
    public static void main(String a[])
    {
        int[] number= {10,20,30,40,50,60};
        System.out.println(" ");
        System.out.println("Program to find the index of an array element");
        
        int element = 30;
        int index = -1;

        for(int i = 0; i< number.length; i++)
        {
            if(number[i] == element)
            {
                index = i;
                break;
            }
            
        }
        System.out.println("Array : " +Arrays.toString(number));
        System.out.println("Index of array " +element+" is : "+index);

    }
}