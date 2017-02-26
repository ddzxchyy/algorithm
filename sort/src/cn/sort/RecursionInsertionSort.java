package cn.sort;

import java.util.Arrays;

public class RecursionInsertionSort {
	public static <T extends Comparable> void Insertion(T[] array, int p, int r)
	{
		T key = array[p];
		for(int i = 0, j = p; j < array.length; j++)
		{
			key = array[j];
			i = j - 1;
			while(i > 0 && key.compareTo(array[i]) < 0)
			{
				//按字典顺序，如果第一个字符串比第二个字符串靠前，就返回负值，相同返回0，否则返回正值 .比如 a < c 返回负值
				array[i + 1] = array[i];
				i--;
			}
			
			array[i + 1] = key;
		}
	}
	
	
	public static <T extends Comparable> void recursionInsertionSort(T[] array, int p, int r)
	{
		if(p < r)
		{
			r--;
			recursionInsertionSort(array, p, r);
			Insertion(array, p, r);
		}
	}
	
	public static void main(String[]args)
	{
		int[] arr = new int[12345678];
		for (int i = 0; i < 12345678; i++)
		{
			arr[i] = (int) Math.random() * 100 + 1;
		}
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		
		System.out.println("用时 : " + (end - start) + " ms");
	}
} 
