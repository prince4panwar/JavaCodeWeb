
import java.util.Scanner;

class program60
{
	void CalcCube()
	{
		System.out.println(" ");
		System.out.println("Program to calculate Cube of an integer upto some integer");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		System.out.println("Cubes of Numbers from 1 to " + num + " : ");
		int i;

		for(i = 1; i <= num; i++)
		{
			int cube = i * i * i;
			System.out.println("Cube of " + i + " is " + cube);
		}
	}
	public static void main(String args[])
	{
		program60 obj = new program60();
		obj.CalcCube();
	}
}