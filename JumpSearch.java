public class JumpSearch {
	public static int jumpSearch(int[] arr, int target) {
		int n = arr.length;
		int step = (int) Math.floor(Math.sqrt(n));
		int prev = 0;

		while (arr[Math.min(step, n) - 1] < target) {
			prev = step;
			step += (int) Math.floor(Math.sqrt(n));
			if (prev >= n) {
				return -1; // Target not found
			}
		}

		while (arr[prev] < target) {
			prev++;
			if (prev == Math.min(step, n)) {
				return -1; // Target not found
			}
		}

		if (arr[prev] == target) {
			return prev; // Target found, return its index
		}

		return -1; // Target not found
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 4, 9 };
		int target = 4;
		int result = jumpSearch(arr, target);
		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + result);
		}
	}
}
