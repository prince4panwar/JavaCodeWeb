
class pro121 
{
    public static void main(String[] args) 
    {
        System.out.println("\nProgram method to find the smallest number among three numbers.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter first number : ");
            double num1 = Double.parseDouble(input.readLine());
            System.out.print("Enter second number : ");
            double num2 = Double.parseDouble(input.readLine());
            System.out.print("Enter third number : ");
            double num3 = Double.parseDouble(input.readLine());
            double small = 0;

            if(num1 < num2){
                if(num1 < num3) small = num1;
                else small = num3;
            } else {
                if(num2 < num3) small = num2;
                else small = num3;
            }
            
            System.out.println("Smallest number : " + small);

        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid year.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}