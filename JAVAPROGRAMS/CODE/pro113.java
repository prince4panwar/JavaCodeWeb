
class pro113
{
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
             System.out.println("\nProgram to calculate HCF of Two given numbers using loop.\n");
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(input.readLine());

            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(input.readLine());

            int hcf = calculateHCF(num1, num2);

            System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}