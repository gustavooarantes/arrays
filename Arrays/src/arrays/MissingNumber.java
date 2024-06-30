package arrays;

public class MissingNumber {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 5, 6, 7, 8};
		int missingNumber = findMissingNumber(arr);
		System.out.println(missingNumber);
	}
	
	public static int findMissingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1)/2;
		
		for (int num  : arr) {
			sum = sum - num;
		}
		return sum;
	}
}
