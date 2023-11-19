
class pro125
{
    public static void main(String[] args) 
    {
        System.out.println("\nProgram method to check whether an year entered by the user is a leap year or not.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a year: ");
            int year = Integer.parseInt(input.readLine());

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid year.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}