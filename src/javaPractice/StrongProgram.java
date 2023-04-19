package javaPractice;

public class StrongProgram {
	
	public static void main(String[] args) {
		//sum of factorial of that num == num
		int n = 145;
		int temp1=n;
		int sum=0;
		while (temp1>0) {
			int reminder=temp1%10;
			int fact=1;
			for (int i = 1; i <= reminder; i++) {
				fact *=i;
			}
			sum+=fact;
			temp1/=10;
		}
		if (sum==n) {
			System.out.println("Given Number "+n+" is a strong number");
		}else {
			System.err.println("Given Number "+n+" is not a strong number");
		}
	}
}
