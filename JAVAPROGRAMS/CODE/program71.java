import java.util.Scanner;
class program71{
	void ConvertString(){
		System.out.println("Program to Convert String to Uppercase");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String text = scan.nextLine();
		String result = text.toUpperCase();
		System.out.println("Uppercase String is : " + result);
	}
	public static void main(String args[]){
		program71 obj = new program71();
		obj.ConvertString();
	}
}