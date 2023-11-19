
class pro122
{
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("\nProgram method to count all words in a string.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a string: ");
            String text = input.readLine();

            int wordCount = countWords(text);

            System.out.println("Total words in the string: " + wordCount);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }
}