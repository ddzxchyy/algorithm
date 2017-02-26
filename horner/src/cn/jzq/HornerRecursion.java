package cn.jzq;

/**
 * µ›πÈ∞ÊªÙƒ…πÊ‘Ú
 * @author Administrator
 *
 */
public class HornerRecursion {
	public static void main(String[]args)
	{
		int[] array = {1,2,3}; 
		int x = 2;
		int ans = hornerRecursion(array, array.length, 0, x);
		System.out.println(ans);
	}



	public static int hornerRecursion(int[] a, int n, int index, int x)
	{
		if(index == n - 1)
			return a[n - 1];
		else
			return hornerRecursion(a, n, index + 1, x) * x + a[index];
	}
}
