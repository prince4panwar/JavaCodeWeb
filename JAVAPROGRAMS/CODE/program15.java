import java.util.Date;
import java.text.SimpleDateFormat;
class program15{
	public static void main(String args[]){
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		String formattedDate = dateFormat.format(currentDate);
		System.out.println("Current System Time is : " + formattedDate);
	}
}