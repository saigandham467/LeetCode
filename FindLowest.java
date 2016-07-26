package leetcode;

import java.util.Arrays;

public class FindLowest {
	public int findnumber(int val)
	{
		int[] arr=new int[10];
		int num;
		Arrays.fill(arr, 0);
		while(val>0)
		{
			num=val%10;
			arr[num]+=1;
			val=val/10;
		}
		int temp=0;
		for(int i=1;i<10;i++)
		{
			
		}
	}

}
