package dev.algorithms.sort;

/*
	1) Has worst kind of sorting in the recent.
	2) Since timecomplexity is bad, its pretty much obvious that the space complexity must be
	good since space was least utelized.
	3) Best, Average and Worst --> O (n^2). It's a quadratic time complexity.
 */
/*
	URL : https://www.geeksforgeeks.org/selection-sort/
	Space Complexity : O (1)
	Time Complexity : O(n^2)
*/
public class SelectionSort {

	public void sort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_idx]) min_idx = j;
			}

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
}