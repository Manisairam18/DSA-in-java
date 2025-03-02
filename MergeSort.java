
public class MergeSort {

	void merge(int arr[], int left, int middle, int right) {

		int n1 = middle - left + 1;
		int n2 = right - middle;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i) {
			L[i] = arr[left + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[middle + 1 + j];
		}

		int i = 0, j = 0;
		int k = left;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int left, int right) {

		if (left < right) {
			int middle = (left + right) / 2;
			sort(arr, left, middle);
			sort(arr, middle + 1, right);
			merge(arr, left, middle, right);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6, 7 };

//		System.out.println("Given Array:");
//		printArray(arr);

		MergeSort obj = new MergeSort();
		obj.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array:");
		printArray(arr);
	}
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Description:
A divide and conquer algorithm that was invented by John von Neumann in 1945. It divides the unsorted list into 𝑛 
n sublists, each containing one element, and then repeatedly merges sublists to produce new sorted sublists until there is only one sublist remaining.
Time Complexity: 
         𝑂(𝑛 log 𝑛)

