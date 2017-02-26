package cn.sort;

import java.util.Arrays;

/**
 * 随机化快速排序
 * 减少栈内存的使用
 * @author 蒋正强
 *
 */
public class RandomQuickSort
{
	/**
	 * 用于简化调用操作
	 * 
	 * @param arr
	 */
	public static void sort(int[] arr)
	{
		quickSort(arr, 0, arr.length - 1);
	}

	/**
	 * 
	 * @param arr
	 * @param p
	 * @param r 主元
	 */
	private static void quickSort(int[] arr, int p, int r)
	{
		if (p < r)
		{
			int q = randomizedPartition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
			
		}
	}

	/**
	 * 对数组进行原址排序
	 * 
	 * @param arr
	 * @param p
	 * @param r
	 * @return
	 */
	private static int partition(int[] arr, int p, int r)
	{
		int x = arr[r]; // 主元
		int i = p - 1;
		for (int j = p; j <= r - 1; j++)
		{
			if (arr[j] <= x)
			{
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, r); // 交换主元

		System.out.println(i + 1);
		return i + 1; // 返回新的主元索引
	}

	/**
	 * 随机化分割
	 * @param arr
	 * @param p
	 * @param r
	 * @return
	 */
	private static int randomizedPartition(int[] arr, int p, int r)
	{

		int i = (int) (Math.random() * (r - p + 1)) + p;// 生成p到r之间的随机数

		swap(arr, r, i);

		return partition(arr, p, r);

	}

	/**
	 * 交换数组的值
	 * 
	 * @param arr
	 * @param i
	 * @param j
	 */
	private static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args)
	{
		int[] arr = { 2, 8, 7, 1, 3, 5, 6, 4 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
