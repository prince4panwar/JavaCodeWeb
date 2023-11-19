
import java.util.Scanner;

class program79
{
   public static void main(String[] args)
    {
        System.out.println(" ");
		System.out.println("Program to reverse a String");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String text = scan.nextLine();

        StringBuilder reverseString = new StringBuilder();
        reverseString.append(text);
        reverseString.reverse(); 
        System.out.println(" ");
        System.out.println("Original string: "+text); 
        System.out.println("Reversed string: "+reverseString);  
  }   
}
        
  


        


