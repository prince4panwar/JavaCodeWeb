import java.util.Scanner;
class program69{
	void Concatenate(){
		System.out.println("Program to Concatenate Two Strings");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String first = scan.nextLine();
		System.out.print("Enter second string : ");
		String second = scan.nextLine();
		String merged = first + " " + second;
		System.out.println("Concatenated String is : " + merged);
	}
	public static void main(String args[]){
		program69 obj = new program69();
		obj.Concatenate();
	}
}