package tyss_practice;


public class Array_BubbleSort{

	public static void main(String[] args) {
		
		int [] a = {5,0,1,8,2};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.print("[ ");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println("]");
		
		System.out.println("First min Number is : "+a[0]);
		System.out.println("Second min number is : "+a[1]);
		System.out.println("First max number is : "+a[a.length-1]);
		System.out.println("Second Max number is : "+a[a.length-2]);
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("last min number : "+a[a.length-1]);
		System.out.println("last max number : "+a[0]);
		
		
	}
}
