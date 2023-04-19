package practiceProgramming;

public class reverseStringwithoutForLoop {
	static int count;
	public static void main(String[] args) {
		
		String name = "Sindhupriya";
		char[] chArr = name.toCharArray();
		count=chArr.length-1;
		reverseString(chArr);
		
	}
	public static void reverseString(char[] chArr) {
		System.out.print(chArr[count]);
		count--;
		if (count<0) {
			return;
		}
		reverseString(chArr);
	}
}
