import java.util.Scanner;
class program5{
	void average(){
		int num, sum=0, i, average;
		System.out.println("Program to calculate average of five numbers");
		Scanner scan = new Scanner(System.in);
		for(i=1; i<=5; i++){
			System.out.print("Enter number " + i + " : ");
			num = scan.nextInt();
			sum += num;
		}
		average = sum/5;
		System.out.println("Average of Five Numbers is : " + average);
	}
	public static void main(String args[]){
		program5 obj = new program5();
		obj.average();
	}
}