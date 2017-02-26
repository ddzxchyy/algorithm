package cn.sort;

import java.util.Arrays;

/**
 * 二分插入排序
 * @author Administrator
 *
 */
public class BinaryInsertionSort {
	public static int  binary(int[] array, int p, int r, int value)
	{
		for(int j = p; j < r; j++)
		{
			if(array[j] == value)
				return j;
		}
		return -1;
	}
	
	public static int binarySearchRecursion(int[] array, int p, int r, int value)
	{
		int q;
		if(p == 0 && r == 1 && array[0] == value)
			return 0;
		
		else if(p + 1 < r)
		{
			q = (p + r) / 2;
			if(array[q] > value)
			{
				binarySearchRecursion(array, p, q, value);
				return binary(array, p, q, value);
			}
			else
			{
				binarySearchRecursion(array, q + 1, r, value);
				return binary(array, q, r, value);
			}
		}
		return -1;
	}
	
	public static void binaryInsertionSort(int[] array)
	{
		int key = 0;
		int k = 0;
		int i = 0;
		for(int j = 1; j < array.length; j++)
		{
			key = array[j];
			i = j - 1;
			k = binarySearchRecursion(array, 0 , i, key);
			if(k != -1)
			{
				for(int s = i; s < k; s--)
				{
					array[s + 1] = array[s];
					array[k] = key;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] a = {1, 3, 2, 4, 5, 7, 6, 8, 0};
		binaryInsertionSort(a);
		System.out.println(Arrays.toString(a));
	}
}