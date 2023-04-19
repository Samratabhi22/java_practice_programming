package practiceProgramming;

public class OccuranceOfChar {

	public static void main(String[] args) {
		String str = "ENGINEERINGengineering";
		char[] strChar = str.toLowerCase().toCharArray();
		char ch='e';
		int count=0;
		for(int i =0; i<strChar.length;i++) {
			if(ch==strChar[i]) {
				count++;
			}
		}
		System.out.println(ch+" is repeated "+count+" many times");
				
	}
}
