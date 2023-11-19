class oneHundredFive 
{
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("\nProgram to Accept the Marks of a Student and find Total Marks and Percentage\n");
            System.out.print("\nEnter the number of subjects: ");
            int n = Integer.parseInt(input.readLine());

            int[] marks = new int[n];
            int totalMarks = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = Integer.parseInt(input.readLine());
                totalMarks += marks[i];
            }

            double percentage = (double) totalMarks / (n * 100) * 100;

            System.out.println("\nTotal Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}