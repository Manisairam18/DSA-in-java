public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 99, 6, 54, 23, 84, 2 };

		int l = arr.length;

		for (int i = 0; i < l - 1; i++) {
			int index = i;
			for (int j = i + 1; j < l; j++) {
				if (arr[index] > arr[j]) {
					index = j;
				}

			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;

		}
		for (int array : arr) {
			System.out.print(array + " ");
		}

	}

}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Description: 
Divides the input list into two parts: a sorted sublist of items which is built up from left to right at the front of the list, and a sublist of the remaining unsorted items.
The algorithm repeatedly selects the smallest (or largest) element from the unsorted sublist, swaps it with the leftmost unsorted element, and moves the sublist boundaries one element to the right.
Time Complexity: 
            𝑂(𝑛2)


