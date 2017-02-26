package cn.subarray;

import java.util.Arrays;

/**
 * 寻找最大子数组，使该子数组元素之和为所有子数组中最大的
 *
 * 
 * 算法： 1. 利用分治策略，逐层寻找
 * 
 * 2.最大子数组存在三种情况：若将数组在中间元素位置划分为两部分，则最大子数组可能在中间元素的左半部分、右半部分或者是跨越中间元素的部分。
 * 
 * 3.现在我们将问题一分为三，在左半部分寻找最大子数组，在右半部分寻找最大子数组，以及在横跨中间的最大子数组中寻找三者之中最大的。
 * 而左右两半部分的情况其实是以上情况的递归呈现，所以我们只需针对第三种情况提出解决办法。
 * 
 * 4.寻找横跨中间位置的最大子数组可以将问题一分为二：我们确定中间元素，在中间元素的左边找最大的数组，右边找到最大的数组，两边的最大子数组可以确定一个边界，
 * 使得整个横跨数组为所有横跨数组中最大的一个。
 * 
 * 5.递归寻找左右两半部分的最大子数组
 */
public class FindMaxSubArray
{
	public static void main(String[] args)
	{
		int[] arr = new int[12345678];
		for (int i = 0; i < 12345678; i++)
		{
			arr[i] = (int) Math.random() * 100 + 1;
		}
		long start = System.currentTimeMillis();
		SubArray result = findMaximumSubArray(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();

		System.out.println("��ʱ : " + (end - start) + " ms");
	}

	public static SubArray findMaximumSubArray(int[] arr, int low, int high)
	{
		if (high == low)
			return new SubArray(low, high, arr[low]);
		else
		{
			int mid = (low + high) / 2;
			SubArray leftSub = findMaximumSubArray(arr, low, mid);
			SubArray rightSub = findMaximumSubArray(arr, mid + 1, high);
			SubArray crossSub = findMaxCrossingSubArray(arr, low, mid, high);

			if (leftSub.getSum() >= rightSub.getSum() && leftSub.getSum() >= crossSub.getSum())
				return leftSub;
			else if (rightSub.getSum() >= leftSub.getSum() && rightSub.getSum() >= crossSub.getSum())
				return rightSub;
			else
				return crossSub;
		}
	}

	public static SubArray findMaxCrossingSubArray(int[] arr, int low, int mid, int high)
	{
		int left_sum = Integer.MIN_VALUE;
		int sum = 0;
		int max_left = 0;
		int max_right = 0;
		for (int i = mid; i >= low; i--)
		{
			sum += arr[i];
			if (sum > left_sum)
			{
				left_sum = sum;
				max_left = i;
			}
		}

		int right_sum = Integer.MIN_VALUE;
		sum = 0;
		for (int j = mid + 1; j <= high; j++)
		{
			sum += arr[j];
			if (sum > right_sum)
			{
				right_sum = sum;
				max_right = j;
			}
		}

		return new SubArray(max_left, max_right, left_sum + right_sum);
	}

}
