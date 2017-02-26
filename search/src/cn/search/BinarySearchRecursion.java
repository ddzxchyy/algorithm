package cn.search;


/**
 * µÝ¹é°æ¶þ·Ö²éÕÒ 
 */
public class BinarySearchRecursion
{
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
				System.out.println("-----------");
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
}
