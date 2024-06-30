package arrays;

public class SubtractEven {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] newArr = subtractEven(arr);
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		
	}
	
	public static int[] subtractEven(int[] arr) {
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		int[] resultArray = new int[oddCount];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				resultArray[idx] = arr[i];
				idx++;
			}
		}
		return resultArray;
	}

}
