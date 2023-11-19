

class pro130
{
    public static void main(String[] args) 
    {
        System.out.println("\nProgram method to displays prime numbers between 1 to 20.\n");
        System.out.println("Prime numbers between 1 and 20:");
        for (int i = 2; i <= 20; i++) 
            if (isPrime(i)) 
                System.out.print(i + " ");
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}