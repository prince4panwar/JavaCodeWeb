
class pro123 
{
    public static void main(String[] args) throws java.io.IOException {
         System.out.println("\nProgram method to count all vowels in a string.\n");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a string: ");
            String text = input.readLine().toLowerCase();

            int vowelCount = countVowels(text);

            System.out.println("Total vowels in the string: " + vowelCount);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static int countVowels(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}