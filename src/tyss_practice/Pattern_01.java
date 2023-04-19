package tyss_practice;

public class Pattern_01 {
	
	public static void main(String[] args) {
//		pattern_01();
//		pattern_02();
//		pattern_03();
//		pattern_04();
//		pattern_05();
//		pattern_06();
//		pattern_07();
//		Number_pattern_01();
//		Number_pattern_02();
//		Number_pattern_03();
//		Number_pattern_04();
//		Number_pattern_05();
//		Number_pattern_06();
//		Alphabet_pattern_01();
		Alphabet_pattern_02();
		
		
	}
	
	public static void pattern_01() {
		/*
		 *  * * * * *
		 *  * * * * *
		 *  * * * * *
		 *  * * * * *
		 *  * * * * *
		 */
		int row = 10;
		int column = row;
		for (int i = 0; i < row; i++) {//rows
			for (int j = 0; j < column; j++) {// columns
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern_02() {
		/*
		 * *
		 * * *
		 * * * *
		 * * * * *
		 * * * * * *
		 */
		
		int row = 5;
		int column = 5;
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(i>=j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern_03() {
		/*					// i,j
		 * * * * * *		// 0,0  0,1  0,2  0,3  0,4
		 * * * * * 			// 1,0  1,1  1,2  1,3  1,4
		 * * * *			// 2,0  2,1  2,2  2,3  2,4
		 * * *				// 3,0  3,1  3,2  3,3  3,4
		 * *				// 4,0  4,1  4,2  4,3  4,4
		 */
		
		int row = 5;
		int column = 5;
//		for (int i = 1; i <= row; i++) {
//			for (int j = i; j <= row; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(i<=j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern_04() {
		/*         *
		 *       * * 
		 *     * * *
		 *   * * * *
		 * * * * * *
		 */
		
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j>=i) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void pattern_05() {
		/* 
		 * * * * * *
		 *   * * * *
		 *     * * *
		 *       * * 
		 *         *
		 */
		
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if((i+j)>=n-1) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void pattern_06() {
		/*         
		 *      
		 *     * * * * * 
		 *      * * * * 
		 *       * * * 
		 *        * *
		 *         *
		 */
		
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j<i) {
					System.out.print(" ");
				}else
					System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void pattern_07() {
		/*         
		 *          *
		 *         * * 
		 *        * * * 
		 *       * * * *
		 *      * * * * *
		 */
		//not completed
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j<i) {
					System.out.print(" ");
				}else
					System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void Number_pattern_01() {
		/*         
		 *  1 2 3 4 5
		 *  1 2 3 4 5
		 *  1 2 3 4 5
		 *  1 2 3 4 5
		 *  1 2 3 4 5     
		 */
		
		int n = 5;
		for (int i = 0; i < n; i++) {
			int a=1;
			for (int j = 0; j < n; j++) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
	
	public static void Number_pattern_02() {
		/*         
		 * 1 1 1 1 1
		 * 2 2 2 2 2
		 * 3 3 3 3 3
		 * 4 4 4 4 4
		 * 5 5 5 5 5
		 */
		
		int n = 5;
		int a=1;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				System.out.print(a +" ");
			}
			a++;
			System.out.println();
		}
	}
	
	public static void Number_pattern_03() {
		/*         
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4
		 * 1 2 3 4 5
		 */
		
		int n = 5;
		int a=1;
		for (int i = 0; i < n; i++) {
			a=1;
			for (int j = 0; j < n; j++) {
				if(j<=i)
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
	
	public static void Number_pattern_04() {
		/*   
		 * 5
		 * 5 4
		 * 5 4 3
		 * 5 4 3 2
		 * 5 4 3 2 1      
		 */
		
		int n = 5;
		int a;
		for (int i = 0; i < n; i++) {
			a=n;
			for (int j = 0; j < n; j++) {
				if(j<=i)
				System.out.print(a-- +" ");
			}
			System.out.println();
		}
	}
	
	public static void Number_pattern_05() {
		/*   
		 *        1
		 *       2 2
		 *      3 3 3
		 *     4 4 4 4
		 *    5 5 5 5 5       
		 */
		
		int n = 5;
		int a=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j<=i) {
					System.out.print(a+" ");
				}
			}
			a++;
			System.out.println();
		}
	}
	
	public static void Number_pattern_06() {
		/*         
		 * 1 
		 * 2 2 
		 * 1 1 1 
		 * 2 2 2 2
		 * 1 1 1 1 1
		 */
		
		int n = 5;
		int a=1;
		for (int i = 0; i < n; i++) {
			if (a>2) {
				a=1;
			}
			for (int j = 0; j < n; j++) {
				if(j<=i) {
					System.out.print(a +" ");
				}
			}
			a++;
			System.out.println();
		}
	}
	
	public static void Alphabet_pattern_01() {
		/*  
		 * A B C D E 
		 * F G H I J 
		 * K L M N O 
		 * P Q R S T 
		 * U V W X Y 
		 */
		
		int n = 5;
		char a='A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
	
	public static void Alphabet_pattern_02() {
		/*  
		 * A B C D E 
		 * A B C D E
		 * A B C D E 
		 * A B C D E 
		 * A B C D E 
		 */
		
		int n = 5;
		char a='A';
		for (int i = 0; i < n; i++) {
			a='A';
			for (int j = 0; j < n; j++) {
					System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
	
	public static void Alphabet_pattern_03() {
		/*  
		 * 
		 */
		
		int n = 5;
		char a='A';
		for (int i = 0; i < n; i++) {
			a='A';
			for (int j = 0; j < n; j++) {
					System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
	
}
