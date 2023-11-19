
import java.util.Scanner;

class program53
{
    public static void main(String a[])
	{
        Scanner input = new Scanner(System.in);
		int daysofmonth = 0; 
        String MonthName = "Unknown";
        
		System.out.println(" ");
        System.out.print("Enter a month number: ");
        int month = input.nextInt();
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        switch (month) 
		{
            case 1:
                MonthName = "January";
                daysofmonth = 31;
                break;
            case 2:
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
				{
                    daysofmonth = 29;
                } 
				else 
				{
                    daysofmonth = 28;
                }
                    break;
            case 3:
                MonthName = "March";
                daysofmonth = 31;
                break;
            case 4:
                MonthName = "April";
                daysofmonth = 30;
                break;
            case 5:
                MonthName = "May";
                daysofmonth = 31;
                break;
            case 6:
                MonthName = "June";
                daysofmonth = 30;
                break;
            case 7:
                MonthName = "July";
                daysofmonth = 31;
                break;
            case 8:
                MonthName = "August";
                daysofmonth = 31;
                break;
            case 9:
                MonthName = "September";
                daysofmonth = 30;
                break;
            case 10:
                MonthName = "October";
                daysofmonth = 31;
                break;
            case 11:
                MonthName = "November";
                daysofmonth = 30;
                break;
            case 12:
                MonthName = "December";
                daysofmonth = 31;
        }

        System.out.println(MonthName + " " + year + " has " + daysofmonth + " days\n");
    }
}