package practiceProgramming;

public class LenghtOfString {

	public static void main(String[] args) {
		char [] ch = {' ','1','v','V',' ','n','A','e'};
		int spaces = 0;
		int vowels = 0;
		int digits = 0;
		for (char c : ch) {
			if (c==' ') {
				spaces++;
			}else if (c=='a'||c=='A'|| c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
				vowels++;
			}else if(c>='0'&&c<='9') {
				digits++;
			}
		}
		
		System.out.println(spaces+" ----> Spaces present in array");
		System.out.println(vowels+" ----> vowels present in array");
		System.out.println(digits+" ----> digits present in array");
	}
}
