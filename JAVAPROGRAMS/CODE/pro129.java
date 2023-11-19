

import java.io.BufferedReader;
import java.io.InputStreamReader;

class pro129
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram method to check numbers is palindrome number or not.\n");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a positive number: ");
            int num = Integer.parseInt(input.readLine());

            if (num < 0) {
                System.out.println("Please enter a positive number.");
            } else {
                int originalNum = num;
                int reversedNum = 0;

                while (num != 0) {
                    int digit = num % 10;
                    reversedNum = reversedNum * 10 + digit;
                    num /= 10;
                }

                if (originalNum == reversedNum) {
                    System.out.println(originalNum + " is a palindrome.");
                } else {
                    System.out.println(originalNum + " is not a palindrome.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}