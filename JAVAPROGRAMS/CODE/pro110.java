
class pro110
{
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.println("\nProgram that prompts the user to input an integer and then outputs the number with the digits reversed order.\n");
            
            System.out.print("Enter an integer: ");
            int n = Integer.parseInt(input.readLine());
            int reversed = 0;
            while (n != 0) {
                reversed = (reversed * 10) + (n % 10);
                n /= 10;
            }
            System.out.println("Number with reversed digits: " + reversed);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}