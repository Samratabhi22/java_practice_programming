package tyss_practice;

public class Array_Programs {
	public static void main(String[] args) {
		int[] array = {5,3,0,1,4,-4,-4,0};
//		System.out.println("first_min_num : " + first_min_num(array));
//		System.out.println("second_min_num : " + second_min_num(array));
//		System.out.println("first_max_num : " + first_max_num(array));
//		System.out.println("second_max_num : " + second_max_num(array));
//		System.out.println("sum_of_first_3_min_num : " + sum_of_first_n_min_num(array, 4));
//		System.out.println("sum_of_first_3_max_num : " + sum_of_first_n_max_num(array, 4));
//		System.out.println("multiplication_of_first_3_min_num : " + multiplication_of_first_n_min_num(array, 3));
//		System.out.println("multiplication_of_first_3_max_num : " + multiplication_of_first_n_max_num(array, 3));
//		System.out.println(first_Second_min_without_bubbleSort(array));
		first_three_Multiplication_witout_bubbleSOrt();
	}

	public static int first_min_num(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	public static int second_min_num(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[1];
	}

	public static int first_max_num(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static int second_max_num(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[1];
	}

	public static int sum_of_first_n_min_num(int[] array, int n) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		if (n < array.length) {
			while (n >= 0) {
				sum = sum + array[n];
				n--;
			}
			return sum;
		} else {
			System.out.println("array lengthgh is less than given value");
			return sum;
		}
	}

	public static int sum_of_first_n_max_num(int[] array, int n) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		if (n < array.length) {
			for (int i = array.length - 1; i >= n; i--) {
				sum = sum + array[i];
			}
			return sum;
		} else {
			System.out.println("array lengthgh is less than given value");
			return sum;
		}
	}

	public static int multiplication_of_first_n_min_num(int[] array, int n) {
		int mul = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		if (n < array.length) {
			while (n >= 0) {
				mul = mul * array[n];
				n--;
			}
			return mul;
		} else {
			System.out.println("array lengthgh is less than given value");
			return mul;
		}
	}

	public static int multiplication_of_first_n_max_num(int[] array, int n) {
		int mul = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		if (n < array.length) {
			for (int i = array.length - 1; i >= n; i--) {
				mul = mul * array[i];
			}
			return mul;
		} else {
			System.out.println("array lengthgh is less than given value");
			return mul;
		}
	}

	public static String first_Second_min_without_bubbleSort(int[] array) {
//		int[] array = {5,3,0,1,4};
		int firstMin = array[0];
		int secondMin = array[0];
		for (int i = 0; i < array.length; i++) {
			if (firstMin>array[i]) {
				secondMin = firstMin;
				firstMin = array[i];
			}else if(secondMin>array[i] && array[i]!=firstMin) {
				secondMin=array[i];
			}
		}
		
		System.out.println(firstMin);
		System.out.println(secondMin);
		return ("First min: "+firstMin+" Second min: "+secondMin);
	}
	
	public static void first_three_Multiplication_witout_bubbleSOrt() {
		
		int array[] = {2,3,1,4,5,6,7,8,9};
		//we should select diferent value for the variables
		//otherwise we ll not get result if the first value is min
		int firstMin = array[0];
		int secondMin = array[1];
		int thirdMin = array[2];
		for (int i = 0; i < array.length; i++) {
			if (firstMin>array[i]) {
				secondMin = firstMin;//do not add this line because it ll save the same number to the next line also
				firstMin = array[i];
			}else if(secondMin>array[i] && array[i]!=firstMin) {//take "&&" operator for not multiply the 2 same number
				thirdMin=secondMin;
				secondMin=array[i];
			}else if(thirdMin>array[i] && array[i]!=firstMin && array[i]!=secondMin) {
				thirdMin=array[i];
			}
		}
		System.out.println(firstMin*secondMin*thirdMin);
		
	}

}
