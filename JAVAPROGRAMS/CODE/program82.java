
import java.util.Scanner;

class program82
{
	 void CalcSum()
	{
		System.out.println("Program to sum values of an array");
		int i, n, sum = 0;
		Scanner scan = new Scanner(System.in);
                System.out.println(" ");
		System.out.print("Enter the value of Number : ");
		n = scan.nextInt();
		int num[] = new int[n];

		for(i = 0; i < n; i++)
		{
			System.out.print("Enter a array element : ");
			num[i] = scan.nextInt();
			sum += num[i];
		}
		System.out.println(" ");
		System.out.println("Sum of all the element of an array is : " + sum);
	}

	public static void main(String args[])
	{
		program82 obj = new program82();
		obj.CalcSum();
	}
}