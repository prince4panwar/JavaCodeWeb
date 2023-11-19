import java.util.Scanner;
class program41{
	void CalcAvg(){
		System.out.println("Program to calculate Average Marks");
		int size, i, sum = 0;
		double average = 0;
		int[] marks;
		Scanner scan = new Scanner(System.in);
		System.out.print("How many marks you want to enter? : ");
		size = scan.nextInt();
		marks = new int[size];
		for(i = 0; i < size; i++){
			System.out.print("Enter value of marks : ");
			marks[i] = scan.nextInt();
			sum += marks[i];
		}
		if(size > 0){
			average = (double) sum / size;
			System.out.println("Average Marks are : " + average);
		}
		else{
			System.out.println("No Marks are entered. Cannot calculate average ");
		}
	}
	public static void main(String args[]){
		 program41 obj = new  program41();
		obj.CalcAvg();
	}
}