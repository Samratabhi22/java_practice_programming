package practiceProgramming;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int [] arr= {10,20,30,50,10,20,50};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[i]+" --> these are the repeated num");
				}
			}
		}
	}
}
