// Data conversion:- 9. How to convert string to Date.     By(7058/21)
import java.text.SimpleDateFormat;
import java.util.Date;
// Main class
class STD {

	
	public static void main(String[] args)throws Exception
	{
		
		String str = "30/11/2003";

		
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(str);

		
		System.out.println("String is converted to Date:");
		System.out.println(date);				
	}
}