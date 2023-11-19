
import java.util.Arrays;

class program96 
{

       public static void main(String[] args)
       {
        System.out.println("\n Program to get the difference between the largest and smallest values in an array of integers");
        
        int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};
        System.out.println("\n Arrays : "+Arrays.toString(numbers));
        int smallest = numbers[0];
        int largetst = numbers[0];
        for (int i = 1; i < numbers.length; i++) 
        {
            if (numbers[i] > largetst)
            {
                largetst = numbers[i];
            }
            else if (numbers[i] < smallest)
            {
                smallest = numbers[i];
            }
        }
            System.out.println(" Largest Number is : " + largetst);
            System.out.println(" Smallest Number is : " + smallest);
        }
}