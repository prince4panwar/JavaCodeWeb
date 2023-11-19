
class pro120
{
    public static void main(String[] args) 
    {
        System.out.println("\nProgram method to compute the average of three numbers.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            double sum = 0;
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter number " + i + ": ");
                double num = Double.parseDouble(input.readLine());
                sum += num;
            }
            System.out.println("Average of 3 numbers : " + sum/3);

        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid year.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}