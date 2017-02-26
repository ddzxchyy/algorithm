package cn.sort;

import java.util.Arrays;

public class SortTest
{
	public static void main(String[] args)
	{
		// int[] arr = {1,-2,4,5,3,0,-8,7};
		int[] arr = new int[123456789];
		
		for(int i = 0; i < arr.length; i++)
		{
			int key = (int) (Math.random() * 100 - 50);
			arr[i] = key;
		}
		
		long start1 = System.currentTimeMillis();
		//QuickSort.sort(arr); // 120ms
		Merge.mergeSort(arr, 0, arr.length);
		//BinaryInsertionSort.binaryInsertionSort(arr); // 100ms
		//InsertionSort.sort(arr); // 5200ms
		long end1 = System.currentTimeMillis();
		System.out.println("ºÄÊ±" + (end1 - start1) + "ms");
		
	}
}
