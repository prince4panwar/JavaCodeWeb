
class pro115 
{
    public static void main(String arg[]) throws java.io.IOException 
    {
        System.out.println("\nProgram to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;

        Double num;
        String a = "";
        System.out.println("Enter numbers, to quit enter q : ");
        a = input.readLine();
        String[] numbers = a.split(" ");
        for (String numberStr : numbers) {
            if (numberStr.equals("q")) 
                break;

            try {
                num = Double.parseDouble(numberStr);
            } catch (java.lang.NumberFormatException e) {
                continue;
            }

            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("The maximum number was =  " + max);
        System.out.println("The minimum number was  = " + min);
    }
}