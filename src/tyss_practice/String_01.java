package tyss_practice;

public class String_01 {

	public static void main(String[] args) {
		String s ="Software";
		String str ="";
		char[] chArr = s.toCharArray();
		System.out.println("1--> chareter array way");
		for (int i = chArr.length-1; i >= 0; i--) {
			System.out.print(chArr[i]);
		}
		System.out.println();
		System.out.println("2--> Using another string");
		for (int i = 0; i < s.length(); i++) {
			str=s.charAt(i)+str;
		}
		System.out.println(str);
		
		System.out.println("3--> Using String builder inbuilt method");
		StringBuilder sb = new StringBuilder(s);
		StringBuilder str1 = sb.reverse();
		System.out.println(str1.toString());
		
		System.out.println("4--> By simple way");
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println("5--> using the var count");
		
		
	}
}
