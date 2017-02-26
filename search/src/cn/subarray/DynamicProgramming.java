package cn.subarray;
/*
 * 	动态规划的思想(dynamic Programming)
 * 
 * 	从数组的左边界开始，由左至右处理，记录到目前为止处理过的最大子数组。若已知A[1...j]的最大子数组,基于如下性质将解扩展为A[1...j+1]的最大子数组:
 * 		A[1...j+1]的最大子数组要么是A[1...j],要么是某个子数组A[i...j+1](1 <= i <= j + 1)i <= j + 1)
 * 	
 */
public class DynamicProgramming
{
	public static void main(String[] args)
	{
//		int[] arr = new int[123456789];
//		for (int i = 0; i < 123456789; i++)
//		{
//			arr[i] = (int) (Math.random() * 100 -50);
//		}
//		long start = System.currentTimeMillis();
//		System.out.println(getMax(arr));
//		long end = System.currentTimeMillis();
//		
//		System.out.println("��ʱ : " + (end - start) + " ms");
		
		int[] arr = new int[]{1,2,3,4,3,-10,4,4,5,-20,15};
		System.out.println(getMax(arr));
		
	}
	
	public static int getMax(int[] arr)
	{
		int result = 0;
		int sum = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			sum = Math.max(arr[i], arr[i] + sum);//记录当前最大子数组
			result = Math.max(sum, result); //记录最大子数组
		}
		
		return result;
	}
}
