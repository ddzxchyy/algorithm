package cn.search;

import java.util.Arrays;

/**
 * 用归并排序，查找逆序对
 */
public class Inversion {
	private static int count = 0;
	public static void main(String[] args)
	{
		int[] array = {2,3,8,6,1};
		System.out.println(Arrays.toString(array));
		int num = countInversePair(array);
		System.out.println("num is " + num);
		for(int i : array)
			System.out.print(i + " ");
	
	}


	public static int countInversePair(int[] a)
	{
		mergeSort(a, 0, a.length);
		return count;
	}

	public static void merge(int[] a, int p, int q, int r)
	{
		int n1 = q - p ;
		int n2 = r - q;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		int i,j;
		for(i = 0; i < n1; i++)
			L[i] = a[p + i];
		for(j = 0; j < n2; j++)
			R[j] = a[q + j];
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		i = 0;
		j = 0;
		for(int k = p; k < r; k++)
		{
			if(L[i] <= R[j])
			{
				a[k] = L[i];
				i++;
			}

			else{
				if(i <= j)// 必须有等号
				{
					for(int t1 = i; t1 < n1; t1++)
						{
							System.out.println("(" + L[t1] + "," + R[j] + ")");
						}
					count += n1 -i;
				}
				a[k] = R[j];
				j++;
			}
		}
}

	public static void mergeSort(int[] a, int p, int r)
	{
		if(p + 1 < r)
		{
			int q = 0;
			q = (p + r) / 2;
			mergeSort(a, p, q );
			mergeSort(a, q, r);
			merge(a, p, q, r);
		}
	}
}