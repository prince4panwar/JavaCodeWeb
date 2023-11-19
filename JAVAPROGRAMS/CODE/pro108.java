
class pro108 
{
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("\nProgram to print multiplication table of given number.\n");
            System.out.print("Enter a number : ");
            int number = Integer.parseInt(input.readLine());

            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) 
                System.out.println(number + " x " + i + " = " + (number * i));
            
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}