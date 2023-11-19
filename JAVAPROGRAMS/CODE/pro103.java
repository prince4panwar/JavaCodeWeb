class oneHundredThree
{
    public static void main(String[] args) 
    {
        System.out.println("\nProgram to Display Transpose Matrix.\n");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpose = new int[3][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("The original matrix is:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose matrix is:");
        for (int[] row : transpose) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
