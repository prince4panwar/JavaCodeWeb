

class pro128
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram method to find number is even number or not.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter base of triangle: ");
            int num = Integer.parseInt(input.readLine());

            if (num%2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input, please enter a valid binary number.");
        } catch (Exception e) {
            System.out.println("Something is wrong ");
        }
    }
}