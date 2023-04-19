package practiceProgramming;

public class FibonacciSeries {

	public static void main(String[] args) {
		//1,1,2,3,5,8,13,21
		int n =0;
		int f = 1;
		System.out.println(n);
		System.out.println(f);
		int c=0;
		while(c<21) {
			c=n+f;
			n=f;
			f=c;
			System.out.println(c);
		}
	}
}
