
class pro126 
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram method to calculate the area of a triangle.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter base of triangle: ");
            double base = Double.parseDouble(input.readLine());
            System.out.print("Enter height of triangle: ");
            double height = Double.parseDouble(input.readLine());

            if (base < 0 || height < 0) {
                System.out.println("Please enter non-negative values for base and height.");
            } else {
                double area = 0.5 * base * height;
                System.out.println("Area of triangle: " + area);
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input, please enter a valid binary number.");
        } catch (Exception e) {
            System.out.println("Something is wrong ");
        }
    }
}