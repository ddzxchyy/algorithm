package cn.search;

import java.util.Arrays;

public class SearchTest {
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6};
		Arrays.sort(a);
		BinarySearchRecursion test = new BinarySearchRecursion();
		System.out.println(Arrays.toString(a));
		System.out.println(test.binarySearchRecursion(a, 0, a.length, 5));
	}
}
