package practiceProgramming;

public class CheckForLeapYear {

	public static void main(String[] args) {
		int year = 2020;
		if(year%4==0) {
			System.out.println("Given year is a leap year :"+year);
		}else {
			System.out.println("Given year is not a leap year :"+year);
		}
	}
}
