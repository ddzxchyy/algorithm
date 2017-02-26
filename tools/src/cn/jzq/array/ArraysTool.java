package cn.jzq.array;
/**
 * arrayTools,提供以下方法：
 *	  1、打印数组，格式为[1,2,3]
 *	  2、数组逆序
 *    3、传入索引来获取对应的值
 *    4、传入值来获取此值在数组中第一次出现的索引，如果没有则返回-1
 *    5、数组元素从小到大排序
    	
    	
 * @author 蒋正强
 * @version v1.0 2016/7/17
 */
public class ArraysTool {
	/**
	 * 构造一个私有的构造器防止，创建类的对象
	 */
	private ArraysTool()
	{
		
	}

	/**
	 * 数组遍历打印，格式为[1, 2, 3, 4]
	 * @param array 一维int数组
	 */
	public static void toString(int[] array)
	{
		System.out.print("[");
		for(int i = 0; i < array.length; i++)
		{
			if(i != array.length - 1)
				System.out.print(array[i] + ", ");
			else
				System.out.print(array[i] + "]");
		}
		System.out.println();
	}
	
	
	/**
	 * 数组逆序
	 * @param array 一维int数组
	 */
	public static void reserve(int[] array)
	{
		int temp = 0;
		for(int i = 0; i < array.length; i++)
		{
			temp = array[i];
			array[i] = array[array.length- 1 - i];
			array[array.length- 1 - i] = temp;
		}
	}

	/**
	 * 根据传入索引来获取对应的值
	 * @param array 代表接收一个int数组
	 * @param index 代表传人的索引
	 * @return 找到就返回索引对应的值， 没找到返回0
	 */
	public static int indexSearchValue(int[] array, int index)
		{
			if(index >= 0 && index < array.length - 1)
				return array[index];
			else
				return 0;
		}
	
	/**
	 * 根据传人的值找到对应数组的索引
	 * @param array 一维一个int数组
	 * @param value 传入的值
	 * @return 找到返回值对应的索引，没找到返回-1
	 */
	public static int valueSearchIndex(int[] array, int value)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == value)
				return i;
		}
		return -1;
	}
	
	/**
	 * 和mergeSort一起完成归并排序
	 * @param a 一维int数组
	 * @param p 排序的起点
	 * @param q 排序的中点
	 * @param r 排序的终点
	 */
	public static void merge(int[] a, int p, int q, int r)
	{
		int n1 = q - p; //左数组的长度
		int n2 = r - q; //右数组的长度
		int i;
		int j;
		int[] L = new int[n1 + 1]; //左数组
		int[] R = new int[n2 + 1]; //右数组
		for(i = 0; i < n1; i++)
		{	
			L[i] = a[p + i];	  //记录左数组
			System.out.println("L[" + i + "] = " + L[i]);
		}
		System.out.println("---------------------");
		for(j = 0; j < n2; j++)	  //记录右数组
		{
			R[j] = a[q + j];
			System.out.println("R[" + j + "] = " + R[j]);
		}
		System.out.println("====================");
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		i = 0;
		j = 0;
		for(int k = p; k < r ; k++)  //比较左右数组，将较大值赋给数组a
		{
			if(L[i] <= R[j])
			{
				a[k] = L[i];
				i++;
				System.out.println("a[" + k + "] = " + a[k]);
			}
			else
			{
				a[k] = R[j];
				j++;
				System.out.println("a[" + k + "] = " + a[k]);
			}
		}
		System.out.println("此层递归结束");
		System.out.println("**********************");
	}
	/**
	 * 和merge一起完成归并排序，将数组从小到大排序
	 * @param a 一维int数组
	 * @param p 排序的起点
	 * @param r 排序的终点
	 */
	public static void mergeSort(int[] a, int p, int r)
	{
		if(p + 1 < r) 
		{
			int q = (p + r) / 2; //计算中间值
			mergeSort(a, p, q);
			mergeSort(a, q, r);
			merge(a, p, q, r);
		}
	}
}
