public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		int l = arr.length;
		int key = 50;
		int i = 0;
		while (i < l) {

			if (key == arr[i]) {
                       System.out.println(" Element " + key + " found ." + " At the index of : " + i);			
                             break;
			}
			i = i + 1;
		}
		if (i == l) {
			System.out.println(" Element not found :  " + key);
		}

	}

}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                                                     OR

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


public class LinearSearch {
	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i; 
			}
		}
		return -1; 
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 0, 1, 9 };
		int target = 1;
		int result = linearSearch(arr, target);
		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + result);
		}
	}
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                                                          OR
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		int l = arr.length;
		int key = 80;
		int i;
		for (i = 0; i < l; i++) {
			if (key == arr[i]) {
				System.out.println(" Element " + key + " found ." + " At the index of : " + i);
				break;

			}

		}

		if (i == l) {
			System.out.println("Element not found.");
		}
	}
}





