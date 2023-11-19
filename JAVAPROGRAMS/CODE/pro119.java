
class pro119
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram to calculate the sum of following series where n is input by user.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try{
            System.out.print("Enter a number : ");
            int n = Integer.parseInt(input.readLine());

            int sum = 0;
            for(int i=1; i<=n; i++)
                sum += i;
            System.out.println("Sum of sequence is : " + sum);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid year.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}