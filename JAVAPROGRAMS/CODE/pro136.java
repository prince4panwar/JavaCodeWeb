

class pro136 
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram to round up the result of integer division.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the numerator: ");
            int numerator = Integer.parseInt(input.readLine());

            System.out.print("Enter the denominator: ");
            int denominator = Integer.parseInt(input.readLine());

            int result = roundUpIntegerDivision(numerator, denominator);

            System.out.println("Rounded up result of integer division: " + result);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } catch(java.lang.ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static int roundUpIntegerDivision(int numerator, int denominator) {
        if (denominator == 0) 
            throw new java.lang.ArithmeticException();

        int result = numerator / denominator;
        int remainder = numerator % denominator;

        if (remainder != 0) 
            result++;
        
        return result;
    }
}