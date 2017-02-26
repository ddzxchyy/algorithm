package cn.search;

/*binarySearch(a,v)
1	low = 0
2	higher = a.length - 1
3	while low <= high
4		mid = (low + high) / 2
5		if(v == a[mid]
6			return mid
7		else if(v > mid)
8			low = mid + 1
9		else
10			high = mid - 1
*/

/*
	总共有n个元素，随着循环得劲进行，有 n/2, n/4.....,n/(2^k)个元素，k是循环的次数.
	由于n/2^k)取整后大于1，所以最坏的情况是n/(2^k) = 1,得k = lgn；
	所以最坏情况的运行时间为O(lgn)
 */
public class BinarySearch {
	public static int binarySearch(int[] a, int value)
	{
		int low = 0;
		int high = a.length - 1;
		int mid = 0;
		while(low <= high)
		{
			mid = (low + high) / 2;
			if(value == a[mid])
				return mid;
			else if(value > a[mid])
				low = mid + 1; //向下取整所以加1
			else
				high = mid - 1;
		}

		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6};
		int target = 4;
		int index = binarySearch(arr, target);
		System.out.println(index);
	}
}
