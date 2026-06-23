package Lecture_18;

import java.util.*;

// lect 18 = recursion 2
// check if array is sorted = strictly increasingly
public class SortedArrStrictlyIncreasing {
	// declare another function apart from main
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length - 1;
		System.out.println(isArrSort(arr, 0));
	}

	public static boolean isArrSort(int arr[], int n) {
		if (n == arr.length - 1) {
			return true;
		}
		if (arr[n] < arr[n + 1]) {
			return isArrSort(arr, n + 1);
		} else {
			return false;
		}
		// its doing one step and then calling itself
		// self call = recursion
	}
}
