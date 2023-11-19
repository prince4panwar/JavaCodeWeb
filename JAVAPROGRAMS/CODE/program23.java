import java.util.Scanner;
class program23{
	void squareRoot(){
		int num, squareRoot;
		System.out.println("Program to calculate Square Root of an integer");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = scan.nextInt();
		squareRoot = num * num;
		System.out.println("Square Root of " + num + " is : " + squareRoot);
	}
	public static void main(String args[]){
		program23 obj = new program23();
		obj.squareRoot();
	}
}