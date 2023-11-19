
class pro116
{
    public static void main(String[] args) 
    {
        System.out.println("\nProgram to print out all Armstrong numbers between 1 to 600 using loop.\n");
        System.out.println("Armstrong numbers 1 upto to 600 : ");
        for (int number = 1; number <= 600; number++) {
            if (isArmstrong(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        return result == number;
    }
}