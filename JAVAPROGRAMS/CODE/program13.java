import java.util.Scanner;
class program13{
	void displayAscii(){
		System.out.println("Program to print Ascii value of a character");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = scan.next().charAt(0);
		int AsciiValue = (int)ch;
		System.out.println("Ascii Value of " + ch + " is : " + AsciiValue);
	}
	public static void main(String args[]){
		program13 obj = new program13();
		obj.displayAscii();
	}
}