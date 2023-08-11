package day1.All;

public class ToCheckLeapYear {

	public static void main(String[] args) {
int yr=2100;
if(yr%4==0&&yr%100!=0||yr%400==0)
{
	System.out.println("It's a leap year");	
		
}
else
{
	System.out.println("Not a leap year");	
	
}
	}

}
