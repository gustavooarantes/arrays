package arrays;

public class Main {

	public static void main(String[] args) {
		
		// Declaring and initializing array of type integer
		int[] intArray = new int[5];
		
		// Adding elements to an array
		intArray[0] = 5;
		intArray[1] = 4;
		intArray[2] = 3;
		intArray[3] = 2;
		intArray[4] = 1;
		// Updating elements in an array
		intArray[2] = 9;
		intArray[3] = 8;
		
		// Printing an array
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

	}

}
