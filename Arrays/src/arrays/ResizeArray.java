package arrays;

public class ResizeArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		resize(arr, 8);
		
	}
	
	public static void resize(int[] arr, int newSize) {
		
		int[] temp = new int[newSize];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}

}
