import java.util.Scanner;
class program31{
	void CalcArea(){
		double diagonal1, diagonal2, area;
		System.out.println("Program to calculate Area of Rhombus");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first diagonal value : ");
		diagonal1 = scan.nextDouble();
		System.out.print("Enter second diagonal value : ");
		diagonal2 = scan.nextDouble();
		area = (diagonal1 * diagonal2) / 2;
		System.out.println("Area of Rhombus is : " + area);
	}
	public static void main(String args[]){
		program31 obj = new program31();
		obj.CalcArea();
	}
}