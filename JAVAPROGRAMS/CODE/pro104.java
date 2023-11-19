import java.util.Scanner;

class onehunderedFour 
{
  public static void main(String[] args) 
  {
    System.out.println("\nProgram to Search Key Elements in an Array\n");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n = sc.nextInt(); 
    int[] arr = new int[n]; 
    System.out.print("Enter the elements of the array : ");
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt(); 
    }
    System.out.print("Enter the element you want to search : ");
    int key = sc.nextInt(); 
    int index = linearSearch(arr, key);
    if(index == -1) {
      System.out.println("Element not found in the array.");
    }
    else {
      System.out.println("Element found at index " + index + ".");
    }
  }

  public static int linearSearch(int[] arr, int key) {
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == key) {
        return i; 
      }
    }
    return -1; 
  }
}
