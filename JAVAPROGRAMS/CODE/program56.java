import java.util.Scanner;
class program56{
	void LeapYear(){
		System.out.println("Program to Check Leap Year");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = scan.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println(year + " is a Leap Year");
		}
		else{
			System.out.println(year + " is not a Leap Year");
		}
	}
	public static void main(String args[]){
		program56 obj = new program56();
		obj.LeapYear();
	}	
}