import java.util.Scanner;
class program46{
	void CalcPer(){
		System.out.println("Program to calculate CGPA to Percentage");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter CGPA out of 10 : ");
		double cgpa = scan.nextDouble();
		double percentage = cgpa * 9.5; //formula can vary between institutions
		System.out.println("Your percentage is : " + percentage + " % ");
	}
	public static void main(String args[]){
		 program46 obj = new  program46();
		obj.CalcPer();
	}
}