import java.util.Scanner;
class program62{
    void CalcTable(){
        System.out.println("Program to Print Multiplication Table of a Number");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        System.out.println("Multiplication Table of " + num + " is : ");
        int i;
        for(i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
    public static void main(String args[]){
       program62 obj = new program62();
        obj.CalcTable();
    }
}