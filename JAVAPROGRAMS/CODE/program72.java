
import java.util.Scanner;

class program72
{
	void RemoveSpace()
	{
		System.out.println(" ");
		System.out.println("Program to Remove Whitespaces from a String");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a paragraph : ");
		String para = scan.nextLine();
		String result = para.replaceAll("\\s+","");
		System.out.println(" ");
		System.out.println("Original String is : " + para);
		System.out.println("Trimmed String is : " + result);
	}
	public static void main(String args[])
	{
		program72 obj = new program72();
		obj.RemoveSpace();
	}
}