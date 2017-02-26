package cn.jzq;
/**
 * 霍纳规则，给定了系数a[0],a[1],...,a[n]
 * y = 0
 * for i = n downto 0
 * 		y = a[i] + x * y
 * 
 * 实现了多项式的求和
 */
public class HornerTest {
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3};
		int answer = horner(a, 2);
		System.out.println(answer);
	}
	
	public static int horner(int[] array, int x)
	{
		int answer = 0;
		for(int i = array.length - 1; i >= 0; i--)
		{
			answer = array[i] +  x * answer;
			System.out.println("array[" + i + "] = " + array[i]);
			System.out.println("answer = " +answer);
		}
		
		return answer;
	}
}
