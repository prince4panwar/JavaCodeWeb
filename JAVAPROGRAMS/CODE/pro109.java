
class pro109
 {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.println("\nProgram to find the factorial value of any number entered through the keyboard.\n");
            System.out.print("Enter a number to find its factorial: ");
            int number = Integer.parseInt(input.readLine());

            if(number >=0){
                long factorial = 1;
                for(int i = 2; i <= number; i++)
                factorial *= i;
                
                System.out.println("Factorial of " + number + " is: " + factorial);
            } else {
                System.out.println("Cannot calculate factorial for negative number");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}