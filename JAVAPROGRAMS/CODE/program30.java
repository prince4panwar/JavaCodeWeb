import java.util.Scanner;
class program30{
	void CalcArea(){
		double side, area;
		System.out.println("Program to calculate Area of Equilateral Triangle");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of side : ");
		side = scan.nextDouble();
		area = (Math.sqrt(3) / 4) * side * side;
		System.out.println("Area of Equilateral Triangle is : " + area);
	}
	public static void main(String args[]){
		 program30 obj = new  program30();
		obj.CalcArea();
	}
}