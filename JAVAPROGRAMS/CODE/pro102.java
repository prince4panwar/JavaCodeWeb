

class oneHundredTwo
 {
    public static void main(String[] args) throws java.io.IOException
     {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.println("\nProgram to Sort Names in an Alphabetical Order.\n ");
            System.out.print("Enter the elements of the array : ");
            String[] names = input.readLine().toLowerCase().split(" ");

            java.util.Arrays.sort(names);

            System.out.print("Sorted array in ascending order: ");
            for (String name : names) 
                System.out.print(name + " ");
            System.out.println();

        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}