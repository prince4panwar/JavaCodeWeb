
class pro138
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram to convert a float value to absolute value.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a float value: ");
            float floatValue = Float.parseFloat(input.readLine());

            float absoluteValue = convertToAbsoluteValue(floatValue);

            System.out.println("Absolute value of the float: " + absoluteValue);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid float value.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static float convertToAbsoluteValue(float value) {
        return Math.abs(value);
    }
}