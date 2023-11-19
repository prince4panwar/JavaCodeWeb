
class pro124 
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram method to compute the sum of the digits in an integer.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int number;

        try {
            System.out.print("Enter an integer: ");
            number = Integer.parseInt(input.readLine());
            
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.println("Sum of digits: " + sum);

        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input, please enter a valid binary number.");
        } catch (Exception e) {
            System.out.println("Something is wrong ");
        }
    }
}