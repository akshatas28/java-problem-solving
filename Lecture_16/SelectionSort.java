package Lecture_16;

import java.util.*;

// lect 16 = sorting = selection sort
public class SelectionSort {
	// time complexity = O(n^2)
	public static void main(String[] args) {
		int arr[] = { 7, 8, 3, 1, 2 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				int pivot = arr[j];
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j + 1];
					arr[j + 1] = pivot;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
