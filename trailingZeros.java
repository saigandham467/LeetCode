package leetcode;

public class trailingZeros {
	public int calculate(int n)
	{int count=1;
	 int counter=-1;
		while(n%count==0)
		{
			n=n*10;
			counter =counter+1;
		}
		return counter;
	}
}
