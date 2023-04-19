package strings;

public class CharectorCountInString {

	public static void main(String[] args) {
		String str = "Anupam";
		// we can use non-static method length() to get the numbers of char
		int charectorsInString = str.length();
		System.out.println("charectorsInString : "+charectorsInString);
		
		//we can convert it to char[] and find the no of char without using length
		char[] chr=str.toCharArray();
		int charectorInCharArray = chr.length;
		System.out.println("charectorInCharArray: "+charectorInCharArray);
		
		//we can use for each to find the numbers of characters in Strings
		int count=0;
		for (char c : chr) {
			count++;
		}
		System.out.println("charectorsInString: "+count);
	
	}
}
