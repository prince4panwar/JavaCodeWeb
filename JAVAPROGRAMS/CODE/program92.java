
class program92
{
    public static void main(String arg[])throws java.io.IOException
    {
        System.out.println("\n Program to add two matrices of the same size");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try{
            System.out.println("\n Enter the Size of matrices");
            System.out.print(" Enter number of rows : ");
            int rows = Integer.parseInt(input.readLine());
            System.out.print(" Enter number of columns : ");
            int cols = Integer.parseInt(input.readLine());
            int[][] arr1,arr2;
            arr1= new int[rows][cols];
            arr2= new int[rows][cols];

            System.out.println("\n Enter the elements of first matrix :");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++)
                {   
                    System.out.print(" Enter for position "+i+" "+j+" : ");
                    arr1[i][j]=Integer.parseInt(input.readLine());
                }
            }
            
            System.out.println("\n Enter the elements of second matrix :");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {   
                    System.out.print(" Enter for position "+i+" "+j+" : ");
                    arr2[i][j]=Integer.parseInt(input.readLine());
                }
            }
            
            System.out.println("\nGiven matrices are : ");
            System.out.println("Matrix-1");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                    System.out.print(arr1[i][j]+" ");
                System.out.println();
            }

            System.out.println("\nMatrix-2");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                    System.out.print(arr2[i][j]+" ");
                System.out.println();
            }
            
            System.out.println("\nSum of the matrices : ");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    arr1[i][j] += arr2[i][j];
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
        }
        catch(java.lang.NumberFormatException e){
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}