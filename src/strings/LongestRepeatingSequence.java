package strings;

public class LongestRepeatingSequence {  
  
    public static void main(String[] args) {  
        String str = "popupop";  
        //to store Largest repeating sequence
        String lrs="";  
        
        int n = str.length();  
        // to compare the 2 string we need divide the main string in two part
        //first start with the full length with length-1 in second loop
        for(int i = 0; i < n; i++){  
            //by reducing length of string it will check the repetition 
        	for(int j = i+1; j < n; j++){  
                //Checks for the largest common factors in every substring  
                String x = lcp(str.substring(i,n),str.substring(j,n));  
                //If the current prefix is greater than previous one  
                //then it takes the current one as longest repeating sequence  
                if(x.length() > lrs.length()) lrs=x;  
            }  
        }  
        System.out.println("Longest repeating sequence: "+lrs);  
    } 
	
	//Checks for the largest common prefix  
  
	public static String lcp(String s, String t){  
       // int n = Math.min(s.length(),t.length());  
        //pass the min length for the repetition
		int n = t.length();
		for(int i = 0; i < n; i++){  
            if(s.charAt(i) != t.charAt(i)){  
                return s.substring(0,i);  
            }  
        }  
        return s.substring(0,n);  
    }  
  
 
}
