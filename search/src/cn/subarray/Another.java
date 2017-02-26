package cn.subarray;


/*
 * 从第一个元素开始加,每加一次之后就要比较、记录一下最大和,如果加到某个元素的时候子数组的和为负数了，
 * 那就要放弃之前所有元素相加之和，然后从下个元素开始重新开始计算子数组的和
 */
public class Another
{
	public static void main(String[] args)
	{
		int[] arr = new int[123456789];
		for (int i = 0; i < 123456789; i++)
		{
			arr[i] = (int) Math.random() * 100 + 1;
		}
		long start = System.currentTimeMillis();
		System.out.println(maxSum(arr));
		long end = System.currentTimeMillis();
		
		System.out.println("用时 : " + (end - start) + " ms");
	}

	public static int maxSum(int[] arr)
	{
		int sum = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (sum < 0)
				sum = arr[i];
			else
				sum += arr[i];
			
			if (max < sum)
				max = sum;
		}
		return max;
	}
}
