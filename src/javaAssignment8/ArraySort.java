package javaAssignment8;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] array = { 100, 20, 67, 88, 99, 10 };
		int index;
		for (int i = 0; i < array.length; i++) {// pointing index as the position of smallest element in array.
			index = i;
			for (int j = i; j <= array.length - 1; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			// swapping elements-->swapping and getting smallest element to start position
			// and next smallest to next position etc.
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// using Arrays class and function sort and passing argument as integer array to
		// be sorted
		// Arrays.sort(array);
		// System.out.println("The sorted array using sort() from arrays Class: "+Arrays.toString(array));

	}
}