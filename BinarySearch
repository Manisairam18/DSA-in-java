public class BinarySearch {
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid; // Target found, return its index
			}

			if (arr[mid] < target) {
				left = mid + 1; // Search the right half
			} else {
				right = mid - 1; // Search the left half
			}
		}

		return -1; // Target not found
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 4, 9 };
		int target = 4;
		int result = binarySearch(arr, target);
		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + result + " the target are " + target);
		}
	}
}

