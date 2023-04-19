package practiceProgramming;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int i = 5;
		int n=i;
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}
}
