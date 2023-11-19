
import java.util.Scanner;

class program80
{
	public static void main(String args[])
	{
		System.out.println(" ");
		System.out.println("Program to remove html tags from a string");
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a string with using Html tags : ");
                String text = scan.nextLine();

                String remove= text.replaceAll("\\<.*?\\>"," ");
		System.out.println(" ");
		System.out.println("Original String is : " + text);
		System.out.println("Replaced String is : " + remove);
	}
	
}



















