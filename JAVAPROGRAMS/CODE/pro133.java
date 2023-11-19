

class pro133
 {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram to reverse an integer number.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter an integer number: ");
            int number = Integer.parseInt(input.readLine());
            int reversedNumber = reverseNumber(number);
            System.out.println("Reversed number: " + reversedNumber);

        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}