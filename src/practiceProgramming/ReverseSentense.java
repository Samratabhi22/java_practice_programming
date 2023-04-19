package practiceProgramming;

public class ReverseSentense {

	public static void main(String[] args) {
		 String sentense = "Family is everything";
		 String[] str = sentense.split(" ");
		 String revSentense = " ";
		 for (int i = 0; i < str.length; i++) {
			revSentense=str[i]+" "+revSentense;
		 }
		 System.out.println(revSentense);
	}
}
