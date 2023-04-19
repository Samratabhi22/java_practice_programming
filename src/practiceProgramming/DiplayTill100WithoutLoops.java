package practiceProgramming;

public class DiplayTill100WithoutLoops {

	public static void main(String[] args) {
		rec1(1);
	}
	
	public static void rec1(int n) {
		
		if(n>100) {
			return;
		}
		System.out.println(n);
		n++;
		rec1(n);
		
	}
	
}
