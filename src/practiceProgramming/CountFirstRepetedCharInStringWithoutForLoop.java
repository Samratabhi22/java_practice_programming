package practiceProgramming;

import java.util.HashSet;

public class CountFirstRepetedCharInStringWithoutForLoop {
	
	static int count;
	static HashSet<Character> st=new HashSet<>();
	public static void main(String[] args) {
		
		String str = "seleniums";
		char[] chArr = str.toCharArray();
		count=0;
		removeRepeated(chArr);
		int rc = str.length()-st.size();
		System.out.println("Number Of repeated charecter removed : "+rc);
		System.out.println("Number Of non repeated charecter : "+(st.size()-rc));
	}
	
	public static void removeRepeated(char[] chArr) {
		st.add(chArr[count]);
		count++;
		if (count>=chArr.length) {
			return;
		}
		removeRepeated(chArr);
	}
}
