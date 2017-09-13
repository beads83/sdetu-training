package basics;

public class LAB1 {

	public static void main(String[] args) {
		
	
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Min:  " + findMin(numbers));
		System.out.println("Max:  " + findMax(numbers));
		System.out.println("Average:  " + findAvg(numbers));
	}
		public static int findMin(int[] arr) {
			int min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
					
				}
			}
			return min;
		}
		public static int findMax(int[] arr) {
			int max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
					
				}
			}
			return max;
	}
		public static int findAvg(int[] arr) {
			int sum=0;
			for (int n=0; n<arr.length; n++) {
					sum = sum +arr[n];			
			}
			return sum/arr.length;
		}
}