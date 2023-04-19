package tyss_practice;

public class Array_Programs_02 {

	public static void main(String[] args) {
//		if_1st_Dgt_0_Push_all_0s_at_last_if_1st_dgt_is_gtrThan1_push_dgt_at_last();
//		find_1st_and_2nd_max_without_bubblesor();
//		push_all_0s_at_last_with_one_for_loop();
		additionOfArrays();
	}
	

	public static void if_1st_Dgt_0_Push_all_0s_at_last_if_1st_dgt_is_gtrThan1_push_dgt_at_last() {
		int[] a = { 0,0,2,0,4,0 };
		int count =0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				for (;;) {
					if(count==a.length)
						break;
					if (a[count] != 0) {
						int temp = a[count];
						a[count] = a[i];
						a[i] = temp;
						count++;
						break;
					} else
						count++;
				}
			}
		}
	
		//best way to push to last
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if (a[i]==0) {
//					int temp = a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
		
		System.out.print("Pushed 0's at last --> [ ");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println("]");
	
		
		
	}
	
	public static void find_1st_and_2nd_max_without_bubblesor() {
		
		int[] b = {0,3,5,0,1,4,4,-1};
		int fmin = b[0];
		int smin = b[0];
		for (int i = 0; i < b.length; i++) {
			if (b[i]<=fmin) {
				if (b[i]!=fmin) {
					smin=fmin;
				}
				fmin=b[i];
			}else if (fmin==smin || smin>b[i]) {
				smin=b[i];
			}
		}
		System.out.println("the first min number : "+fmin);
		System.out.println("the second min number : "+smin);
		
	}
	
	public static void push_all_0s_at_last_with_one_for_loop() {
		
		int a[] = {0,4,2,0,6,0};
		int b[] = new int[a.length];
		int m = 0;
		int n =a.length-1;
		
		for (int i = 0; i < b.length; i++) {
			if (a[i]!=0) {
				b[m]=a[i];
				m++;
			}else {
				b[n]=a[i];
				n--;
			}
		}
		System.out.print("Pushed 0's at last --> [ ");
		for (int i : b) {
			System.out.print(i+" ");
		}
		System.out.println("]");
	}
	
	public static void additionOfArrays() {
		//
		int [] a = {4,3,2,5,4};
		int [] b = {3,1,5,6};
		int len = a.length;
		if(b.length>a.length) {
			len=b.length;
		}
		//op--> 7 4 7 11 4
		
		for (int i = 0; i < len; i++) {
			try {
				System.out.print( a[i]+b[i]+" ");
			} catch (Exception e) {
				if (a.length<b.length) {
					System.out.print(b[i]+" ");
				}else {
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
