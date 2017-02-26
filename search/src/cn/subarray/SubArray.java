package cn.subarray;

public class SubArray
{
	private int low;
	private int high;
	private int sum = 0;

	public SubArray()
	{
		super();
	}

	public SubArray(int low, int high, int sum)
	{
		this.low = low;
		this.high = high;
		this.sum = sum;
	}

	
	
	public int getLow()
	{
		return low;
	}

	public void setLow(int low)
	{
		this.low = low;
	}

	public int getHigh()
	{
		return high;
	}

	public void setHigh(int high)
	{
		this.high = high;
	}

	public int getSum()
	{
		return sum;
	}

	public void setSum(int sum)
	{
		this.sum = sum;
	}

}