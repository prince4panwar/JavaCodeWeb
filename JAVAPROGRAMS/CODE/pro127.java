

class pro127
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram method to find the area of a pentagon.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the side length of the pentagon: ");
            double sideLength = Double.parseDouble(input.readLine());

            double area = (5.0 / 4.0) * (sideLength * sideLength) / (Math.tan(Math.PI / 5));

            System.out.println("Area of the pentagon: " + area);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}