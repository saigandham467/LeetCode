package leetcode;

public class IntegerBreak {
	public static void main(String[] args)
	{
		IntegerBreak ib=new IntegerBreak();
		int x=ib.solution(100);
		System.out.println(x);
	}
	public int solution(int n)
	{
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else if(n==3)
			return 2;
		else if(n==4)
			return 4;
		else
			return 3*solution(n-3);
	}

}
