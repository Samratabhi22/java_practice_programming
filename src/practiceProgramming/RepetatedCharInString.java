package practiceProgramming;

public class RepetatedCharInString {

	public static void main(String[] args) {
		String str = "gadaging";
		boolean flag=false;
		char[] strChar = str.toCharArray();
		for (int i = 0; i < strChar.length; i++) {
			for (int j = i+1; j < strChar.length; j++) {
				if (strChar[i]==strChar[j]) {
					System.out.println(strChar[i]);
					flag=true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		
	}
	
}
