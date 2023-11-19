
class pro112 
{
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.println("\nProgram to check whether the number is a prime number or not.\n");
            System.out.print("Enter a number to check if it's prime: ");
            int number = Integer.parseInt(input.readLine());

            if (checkPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false;
        return true;
    }
}