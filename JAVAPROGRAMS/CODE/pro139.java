
class pro139
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram to accept a float value of number and return a rounded float value.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a float value: ");
            float floatValue = Float.parseFloat(input.readLine());

            System.out.print("Enter the number of decimals to round to: ");
            int decimals = Integer.parseInt(input.readLine());

            float roundedValue = roundFloatValue(floatValue, decimals);

            System.out.println("Rounded float value: " + roundedValue);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static float roundFloatValue(float value, int decimals) {
        double powerOfTen = Math.pow(10, decimals);
        return (float) Math.round(value * powerOfTen) / (float) powerOfTen;
    }
}