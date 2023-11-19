class ninetyNine {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.util.ArrayList<Integer> arr = new java.util.ArrayList<>();
        java.util.Set<Integer> uniqueElements = new java.util.HashSet<>();

        try {
            System.out.println("\njava program to print all unique element in an array.    \n");
            System.out.print("Enter the elements of the array : ");
            String[] elements = input.readLine().split(" ");

            for (String num : elements)
                arr.add(Integer.parseInt(num));

            for (int num : arr) 
                uniqueElements.add(num);
            
            System.out.print("Unique elements in the array: ");
            for (int element : uniqueElements) 
                System.out.print(element + " ");
            System.out.println();

        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}