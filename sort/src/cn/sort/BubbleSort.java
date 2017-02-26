package cn.sort;

import java.util.Arrays;


public class BubbleSort
{
	public static void bubbleSort(int[] array)
	{
		for (int i = 0; i < array.length - 1; i++)
		{
			for (int j = array.length - 1; j > i; j--)
			{
				if (array[j] <= array[j - 1]) 
				{
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}

	public static void sort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		int[] arr = new int[12345];
		for (int i = 0; i < 12345; i++)
		{
			arr[i] = (int) Math.random() * 100 + 1;
		}
		long start = System.currentTimeMillis();
		bubbleSort(arr);
		long end = System.currentTimeMillis();

		System.out.println(Arrays.toString(arr));
	}
}
