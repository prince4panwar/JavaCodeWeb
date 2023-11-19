
import java.util.Arrays;

class program84
{
       public static void main(String[] args) 
       {  
           System.out.println(" "); 
          System.out.println("Program to calculate the average value of array elements");
          int[] numbers = {22, 30, 25, 35, -16, 60, -100};
          int sum = 0;

          for(int i=0; i < numbers.length ; i++)
          sum = sum + numbers[i];
          double average = sum / numbers.length;
          System.out.println("Arrays : "+ Arrays.toString(numbers)); 
          System.out.println("Average value of the array elements is : " + average); 
        }
}