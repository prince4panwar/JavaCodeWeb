import java.util.Scanner;
class program36{
	void CalcVol(){
		double length, width, height, volume;
		System.out.println("Program to calculate Volume of Cuboid");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length value : ");
		length = scan.nextDouble();
		System.out.print("Enter width value : ");
		width = scan.nextDouble();
		System.out.print("Enter height value : ");
		height = scan.nextDouble();
		volume = length * width * height;
		System.out.println("Volume of Cuboid is : " + volume);
	}
	public static void main(String args[]){
		program36 obj = new program36();
		obj.CalcVol();
	}
}