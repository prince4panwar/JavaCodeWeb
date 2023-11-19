//Program to find the frequency of each element in the array
class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 1};

        // Flag array to mark visited elements
        boolean[] visited = new boolean[arr.length];

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1; // Initialize frequency count for each element
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true; // Mark the element as visited
                        count++; // Increment frequency count
                    }
                }
                System.out.println("Element " + arr[i] + " occurs " + count + " times");
            }
        }
    }
}
