package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class RecursiveFibinocci {
	HashMap<Integer,Integer> hmap;
	public RecursiveFibinocci()
	{
		hmap=new HashMap<Integer,Integer>();
		
		
	}
	public  int fib(int n)
	{
		if(!hmap.containsKey(n))
		{
			if(n<=1)
			{
				hmap.put(n, n);
			}
			else
			{
				hmap.put(n,fib(n-1)+fib(n-2));
			}
		}
		return hmap.get(n);
		
	}
	public static void main(String[] args)
	{
		RecursiveFibinocci RF=new RecursiveFibinocci();
		System.out.println(RF.fib(20));
	}
	

}





