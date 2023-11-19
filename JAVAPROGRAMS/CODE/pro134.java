

class pro134
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nprogram to round a float number to specified decimals.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a float number: ");
            float number = Float.parseFloat(input.readLine());

            System.out.print("Enter the number of decimals to round to: ");
            int decimals = Integer.parseInt(input.readLine());

            float roundedNumber = roundFloat(number, decimals);
            
            System.out.println("Rounded number: " + roundedNumber);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static float roundFloat(float number, int decimals) {
        double powerOfTen = Math.pow(10, decimals);
        return (float) Math.round(number * powerOfTen) / (float) powerOfTen;
    }
}