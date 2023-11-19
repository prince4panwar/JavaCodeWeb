
class program78
{
	public static void main(String args[])
	{
		System.out.println(" ");
		System.out.println("Program to remove a particular character from a string");
                String str = "Morning";
		String replace = str.replaceAll("M"," ");
		System.out.println(" ");
		System.out.println("Original String is : " + str);
		System.out.println("Replaced String is : " + replace);
	}
	
}