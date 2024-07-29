import java.util.Arrays;

public class RadixSort {

	public void sort(int arr[]) {
		int max = getMax(arr);

		for (int exp = 1; max / exp > 0; exp *= 10) {
			countSort(arr, exp);
		}
	}

	int getMax(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	void countSort(int arr[], int exp) {
		int n = arr.length;
		int output[] = new int[n];
		int count[] = new int[10];

		Arrays.fill(count, 0);

		for (int i = 0; i < n; i++) {
			int index = (arr[i] / exp) % 10;
			count[index]++;
		}

		for (int i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}

		for (int i = n - 1; i >= 0; i--) {
			int index = (arr[i] / exp) % 10;
			output[count[index] - 1] = arr[i];
			count[index]--;
		}

		for (int i = 0; i < n; i++) {
			arr[i] = output[i];
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		RadixSort rs = new RadixSort();
		rs.sort(arr);
		System.out.println("Sorted array:");
		printArray(arr);
	}
}



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Description:
A non-comparative sorting algorithm that sorts numbers by processing individual digits. It distributes numbers into buckets according to their radix and then reassembles them.
Time Complexity: 
𝑂(𝑛 ⋅ 𝑘)
O(n⋅k) where k is the number of digits in the largest number
