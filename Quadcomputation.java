package leetcode;

import java.util.HashMap;

public class Quadcomputation {
	HashMap<Integer,Pair> HM=new HashMap<Integer,Pair>();
	
	public int[] solution(int[] arr,int s)
	{
		int[] result=new int[4];
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int k=(arr[i]+arr[j]);
				HM.put(k, new Pair(i,j));
			}
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int k=s-(arr[i]+arr[j]);
				if(HM.containsKey(k))
				{
					Pair p=HM.get(k);
					if(p.x!=i&p.x!=j&p.y!=i&p.y!=j)
					{
						result[0]=i;
						result[1]=j;
						result[2]=p.x;
						result[3]=p.y;
						return result;
						
					}
				}
			}
		}
		return null;
	}
	
	public class Pair{
		int x,y;
		public Pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		
	}

}
