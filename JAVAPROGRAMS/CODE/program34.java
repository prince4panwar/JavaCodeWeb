import java.util.Scanner;
class program34{
	void CalcVol(){
		double radius, volume;
		System.out.println("Program to calculate Volume of Sphere");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius value : ");
		radius = scan.nextDouble();
		volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		System.out.println("Volume of Sphere is : " + volume);
	}
	public static void main(String args[]){
		program34 obj = new program34();
		obj.CalcVol();
	}
}