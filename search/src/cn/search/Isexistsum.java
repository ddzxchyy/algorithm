package cn.search;

import java.util.Arrays;

/**
 * 使用二分法，在数组中寻找二个数的和
 * @author Administrator
 *
 */
public class Isexistsum {
	public static boolean isexistsum(int[] array, int x)
	{
		int k = 0;
		Arrays.sort(array);
		
		for(int j = 0; j < array.length; j ++)
			k = BinarySearch.binarySearch(array, x - array[j]);
		
		if(k != -1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		int[] a = {1,3,2,4,7,5,8,6};
		boolean flag= isexistsum(a,10);
		System.out.println(flag);
	}
	
	

}

