
class program100
{
     public static void main(String args[])
    {
        System.out.println("\nProgram To sort the array In an Ascending Order.");
        int[] arr = {3, 2, 9, 7, 1};
        int temp=0;

        System.out.println("\nOriginal Array : ");
        for(int i = 0; i <arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        // sort array in ascending order
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = i+1; j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
          System.out.println("\nSorted Array in Ascending Order : ");
          for(int i=0;i <arr.length ;i++)
          {
             System.out.print(arr[i]+" ");
          }
           System.out.println(" ");
    }

}