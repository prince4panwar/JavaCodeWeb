class ninty_seven
{
	static void display(int[] arr)
        {
		for(int i: arr)
			System.out.print(i + " ");
		System.out.println();
	}
	public static void main(String[] args)
        {
                System.out.println("\nWrite a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.\n");
		int  zero = 0;
		int[] arr = {0,1,1,1,0,0,1,0,0,1};
		System.out.print("Array before separation : ");
		display(arr);
		for(int i: arr)
                {
			if(i==0) zero++;
		}
		for(int i=0; i<arr.length; i++)
                {
			if(zero>0)
                        {
				arr[i] = 0;
				zero--;
			}
			else arr[i] = 1;
		}
		System.out.print("Array after separation : ");
		display(arr);
	}
}
