package practiceProgramming;

public class AnagramSting {

	public static void main(String[] args) {
		String w1 ="heart";
		String w2 ="earth";
		String s1 = w1.toLowerCase();
		String s2 = w2.toLowerCase();
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int c1 = 0;
		int c2 = 0;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < ch1.length; i++) {
				c1 += ch1[i];
				c2 += ch2[i];
			}
//			System.out.println(c1);
//			System.out.println(c2);
			if (c1 == c2) {
				System.out.println("Given strings are anagram : "+w1+" & "+w2);
			}
		}else {
			System.out.println("Given strings are not anagram");
		}
		

	}
}
