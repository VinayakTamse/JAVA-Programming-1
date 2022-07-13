package examples1;

public class LeapYear2 {
	
	public static void main(String[] args) {
		
		int year = 1956;
		
		boolean flag = false;
		
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					flag = true;
				}
				else
				{
					flag = false;
				}
			}
			else {
				flag = true;
			}
		}
		else {
			flag = false;
		}
		
		if (flag)
		{
			System.out.println(year + " is leap year");
		}
		else {
			System.out.println(year + " Not a leap year");
		}
	}

}
