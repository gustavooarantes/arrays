package arrays;

public class MinValue {
	public static void main(String[] args) {
		
		int[] numArr = new int[5];
		numArr[0] = 290;
		numArr[1] = 325;
		numArr[2] = 475;
		numArr[3] = 190;
		numArr[4] = 600;
		
		int minArr = findMinimum(numArr);
		System.out.println(minArr);
		
	}
	
	public static int findMinimum(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
