package tyss_practice;

public class Array_BinarySearch {

	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6};
		int key = 0;
		if(binarySearch(a, key)) {
			System.out.println("Key is found");
		}else {
			System.out.println("Key is not in array");
		}

	}
	public static boolean binarySearch(int [] sortedArray, int key) {
		int low =0;
		int high=sortedArray.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(key==sortedArray[mid]) {
				return true;
			}else if (key>sortedArray[mid]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return false;
	}
	

}
