public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6 };

		int l = arr.length;

		for (int i = 1; i < l; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;

		}
		System.out.println("After sorting : ");
		for (int array : arr) {
			System.out.print(array + " ");
		}

	}

}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Description:
Builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
Time Complexity: 
              O(n2)
 
