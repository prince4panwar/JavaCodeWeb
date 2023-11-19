import java.util.Scanner;
class program70{
	void ConvertString(){
		System.out.println("Program to Convert String to Lowercase");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String text = scan.nextLine();
		String result = text.toLowerCase();
		System.out.println("Lowercase String is : " + result);
	}
	public static void main(String args[]){
		program70 obj = new program70();
		obj.ConvertString();
	}
}