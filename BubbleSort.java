public class bubbleSort {
	public static void main(String[] args) {
		int arr[] = { 50, 40, 30, 20, 10 };
		int l = arr.length;

//		System.out.println("Before sorting ");
//		for (int array : arr) {
//			System.out.print(array + " ");
//		}
		System.out.println();

		for (int i = 0; i < l - 1; i++) {
			for (int j = 0; j < l - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
//			System.out.println();
//			for (int array : arr) {
//				System.out.print(array + " ");
//			}
		}
		//System.out.println();
		System.out.println("After sorting ");
		for (int array : arr) {
			System.out.print(array + " ");
		}
	}
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Description:
Repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
Time Complexity: 
                 O(n2).
 




