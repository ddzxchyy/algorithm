package cn.sort;

import java.util.Arrays;


/*	InsertionSort(A)
 * 																		���					����
 *	for j = 2 to A.length												C1					n
 *		key = A[j]														C2					n - 1
 *		//IsertA[j] into the sorted sequence A[1..j-1]					C3					n - 1
 *		i = j -1														C4					n - 1
 *		while i > 0 and A[i] > key										C5					n * (n + 1) / 2 - 1
 *			A[i + 1] = A[i]												C6					n * (n - 1) / 2 - 1
 *			i = i -1													C7					n * (n - 1) / 2 - 1
 *		A[i + 1] = key													C8					n - 1
 */
public class InsertionSort {
	public static void insertionSort(int[] array)
	{
		for(int j = 1; j < array.length; j++)
		{
			int key = array[j]; // 要插入的值
			// 将key和循环不变式A[1...j - 1]作比较
			int i = j - 1;
			while(i > -1 && array[i] > key)  
			{
				array[i + 1] = array[i]; //将大于key的值右移一位
				i--;
			}
			array[i + 1] = key; //插入key
		}
	}
	
	public static void sort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int key = arr[i];
			int j = i - 1;
			while(j > -1 && arr[j] < key)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr2 = new int[]{3,4,1,-2,5,-5,0};
		insertionSort(arr2);
		System.out.println(Arrays.toString(arr2));
		sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
	}
}
