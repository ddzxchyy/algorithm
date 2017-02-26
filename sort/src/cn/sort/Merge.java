package cn.sort;

public class Merge {

	/**
	 * 
	 * @param a
	 *            代表数组a
	 * @param p
	 *            代表排序的起点
	 * @param q
	 *            代表要排序的中间值
	 * @param r
	 *            代表数组的长度
	 */
	public static void merge(int[] a, int p, int q, int r) {
		int n1 = q - p; // 左数组的长度
		int n2 = r - q; // 右数组的长度
		int i;
		int j;
		int[] L = new int[n1 + 1]; // 左数组
		int[] R = new int[n2 + 1]; // 右数组
		for (i = 0; i < n1; i++) {
			L[i] = a[p + i]; // 记录左数组
			// System.out.println("L[" + i + "] = " + L[i]);
		}
		// System.out.println("---------------------");
		for (j = 0; j < n2; j++) // 记录右数组
		{
			R[j] = a[q + j];
//			System.out.println("R[" + j + "] = " + R[j]);
		}
//		System.out.println("====================");
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		i = 0;
		j = 0;
		for (int k = p; k < r; k++) // 比较左右数组，将较大值赋给数组a
		{
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
//				System.out.println("a[" + k + "] = " + a[k]);
			} else {
				a[k] = R[j];
				j++;
//				System.out.println("a[" + k + "] = " + a[k]);
			}
		}
//		System.out.println("**********************" + "\n");
	}

	/*
	 * mergeSort(a,p,q) 1 < 8 true --> q = 4, 1 < 4 true --> q = 2, 1 < 2 true -->
	 * q = 1, 1 < 1 false 条件不满足，此层递归结束，将控制权转交给上一层递归，并顺序执行
	 * 
	 * 进入第二个递归 mergeSort（a,q,r）此时，q = 1， r = 2 不满足条件，此层递归结束，返回
	 * 顺序执行下一行，即merge（a,p,q,r）
	 */

	public static void mergeSort(int[] a, int p, int r) {
		if (p + 1 < r) {
			int q = (p + r) / 2; // 计算中间值
			mergeSort(a, p, q);
//			System.out.println("p  = " + p + " q = " + q);
//			System.out.println("第一次mergeSort\n");
			mergeSort(a, q, r);
//			System.out.println("q = " + q + " r = " + r);
//			System.out.println("第二次mergeSort\n");
			merge(a, p, q, r);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[1234567];
		for (int i = 0; i < 1234567; i++)
		{
			arr[i] = (int) Math.random() * 100 + 1;
		}
		long start = System.currentTimeMillis();
		mergeSort(arr, 0, arr.length);
		long end = System.currentTimeMillis();
		
		System.out.println("用时 : " + (end - start) + " ms");
	}

}
