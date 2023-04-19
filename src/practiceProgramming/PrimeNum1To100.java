package practiceProgramming;

public class PrimeNum1To100 {

	public static void main(String[] args) {
		//num should divisible by one and itself 
		
		
		for (int i = 1; i <= 100; i++) {
			int j=2;
			boolean flag=false;
			int n= i;
			while(j<n) {
				if(n%j==0) {
				flag =true;
				break;
				}
				j++;
			}
			if(!flag){
				System.out.println("Prime Num---> "+i);
			}
		}
		
	}
}
