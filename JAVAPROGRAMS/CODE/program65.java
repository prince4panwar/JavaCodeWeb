import java.util.Scanner;
class program65{
	void CheckNumber(){
		System.out.println("Program to Check All Three Number are Equal or Not");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int first = scan.nextInt();
		System.out.print("Enter Second Number : ");
		int second = scan.nextInt();
		System.out.print("Enter Third Number : ");
		int third = scan.nextInt();
		if(first == second && second == third){
			System.out.println("All Three Numbers are Equal");
		}
		else{
			System.out.println("All Three Numbers are Not Equal");
		}
	}
	public static void main(String args[]){
		program65 obj = new program65();
		obj.CheckNumber();
	}
}