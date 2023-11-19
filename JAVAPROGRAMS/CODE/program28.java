
import java.util.Scanner;

class program28
{
	void CalcArea()
	{
		double length, breadth, area;
		System.out.println(" ");
		System.out.println("Program to calculate area of Rectangle");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length value : ");
		length = scan.nextDouble();
		System.out.print("Enter breadth value : ");
		breadth = scan.nextDouble();
		area = length * breadth;
		System.out.println("Area of Rectangle is : " + area);
	}
	        public static void main(String args[])
	        {
		           program28 obj = new program28();
		           obj.CalcArea();
	        }
}