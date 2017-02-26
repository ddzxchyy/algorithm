package cn.sort;

import java.util.Arrays;

public class RunTest {
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{	long begin = System.nanoTime();

		int[] a = {1, 3, 2, 4, 5, 7, 6, 8, 0};
		
		long end = System.nanoTime();
		System.out.println("耗时: " + (end - begin) + "ns");
	}
}
