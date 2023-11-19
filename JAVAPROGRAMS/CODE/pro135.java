
class pro135
{
    public static void main(String arg[])throws java.io.IOException
    {
        System.out.println("\nProgram to test if a double number is an integer.\n");
        double a;
        int b;
        java.io.BufferedReader input = new java.io.BufferedReader (new java.io.InputStreamReader(System.in));
        System.out.print("Enter a number ");

        try{
            a = Double.parseDouble(input.readLine());
            b = (int)a;
            if(a != b) System.out.println(a + " is not an integer");
            else System.out.println(a + " is a integer");
        } catch(java.lang.NumberFormatException e){
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}