import java.util.Scanner;
class program29{
	void CalcArea(){
		double base, height, area;
		System.out.println("Program to calculate Area of Triangle");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter base value : ");
		base = scan.nextDouble();
		System.out.print("Enter height value : ");
		height = scan.nextDouble();
		area = (base * height) / 2;
		System.out.println("Area of Triangle is : " + area);		
	}
	public static void main(String args[]){
		program29 obj = new program29();
		obj.CalcArea();
	}
}