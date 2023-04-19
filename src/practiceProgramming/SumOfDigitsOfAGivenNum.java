package practiceProgramming;

public class SumOfDigitsOfAGivenNum {

	public static void main(String[] args) {
		int num=5624;
		int rem=0;
		while(num>0) {
			rem+=num%10;
			num/=10;
		}
		System.out.println(rem);
	}
}
