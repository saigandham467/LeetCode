package leetcode;

public class Arraywindow {
		int flag=0;
	public int[] maxSlidingWindow(int[] nums, int k) {
	    int[] catchvals=new int[2];
		int[] arr=new int[nums.length-k+1];
		int counter=0;
		int i=0;
		int j=k-1;
		
		catchvals[0]=-1;
		
		while(j<nums.length)
		{
			/*
			if(flag==1)
			{
			arr[counter]=catchvals[1];
			counter=counter+1;
			i=i+1;
			j=j+1;
			}
			*/
			
			if(i<=catchvals[0])
			{
				if(catchvals[1]<nums[j])
				{
					arr[counter]=nums[j];
					counter=counter+1;
					catchvals[0]=j;
					catchvals[1]=nums[j];
					j=j+1;
					i=i+1;
				}
				else
				{
					arr[counter]=catchvals[1];
					counter=counter+1;
					i=i+1;
					j=j+1;
				}
				
			}
			{
				catchvals=calculate(i,j,nums);
				arr[counter]=catchvals[1];
				counter=counter+1;
				i=i+1;
				j=j+1;
			}
		}
		return arr;
	}
	public int[] calculate(int i,int j, int[] nums)
	{
		flag=1;
		int[] returnvals=new int[2];
		int pointer;
		int max=0;
		for(int ii=i;ii<=j;ii++)
		{
			if(ii==i)
			{
				returnvals[1]=nums[ii];
				
				returnvals[0]=ii;
			}
			if(nums[ii]>max)
			{
				
				returnvals[0]=ii;
				returnvals[1]=nums[ii];
			}
		}
		return returnvals;
		
		
	}

}
