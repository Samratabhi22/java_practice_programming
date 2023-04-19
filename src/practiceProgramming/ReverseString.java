package practiceProgramming;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Vinay";
		String s1 = "";
		//method 1
		StringBuilder sb = new StringBuilder(s);
		String revStr = sb.reverse().toString();
		System.out.println(revStr);
		
		//method 2
		char[] strChr = s.toCharArray();
		for (int i=strChr.length-1;i>=0;i--) {
			System.out.print(strChr[i]);
		}
		
		//method3
		for (int i = 0; i < s.length(); i++) {
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
	}
}
