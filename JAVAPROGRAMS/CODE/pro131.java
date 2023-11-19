
class pro131
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram method to find GCD and LCM of Two Numbers.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(input.readLine());

            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(input.readLine());

            int gcd = findGCD(num1, num2);
            int lcm = findLCM(num1, num2);

            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
            System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}