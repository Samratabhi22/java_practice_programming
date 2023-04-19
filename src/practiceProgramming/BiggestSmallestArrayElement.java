package practiceProgramming;

public class BiggestSmallestArrayElement {

	public static void main(String[] args) {
		int [] a = {15,2,5,10,8,9};
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(max>a[i]) {
				max=a[i];
			}
			if(min<a[i]) {
				min=a[i];
			}
		}
		System.out.println("Maximum Num----> "+max);
		System.out.println("Minimum Num----> "+min);
	}
}
