package leetcode;

public class MaxSumarray {
	
	    public int maxSubArray(int[] nums) {
	       return maxsub( nums,0,nums.length-1);
	        
	    }
	    public int maxsub(int[] nums,int start, int end)
	    {
	        if(start==end)
	        {
	            return nums[start];
	        }
	        else
	        {
	            int mid=(start+end)/2;
	            int l=maxsub(nums,start,mid);
	            int r=maxsub(nums,mid+1,end);
	            int c=maxcsub(nums,start,mid,end);
	            return(Math.max(Math.max(l, r), c));
	            
	            	
	            
	            
	        }
	    }
	    public int maxcsub(int[] nums,int start,int mid,int end)
	    {
	        int sum=0;
	        int leftmax=Integer.MIN_VALUE;
	        int rightmax=Integer.MIN_VALUE;
	        for(int i=mid;i>=0;i--)
	        {
	            sum=sum+nums[i];
	            if(sum>leftmax)
	            {
	                leftmax=sum;
	            }
	        }
	        sum=0;
	        for(int j=mid+1;j<=end;j++)
	        {
	            sum=sum+nums[j];
	            if(sum>rightmax)
	            {
	                rightmax=sum;
	            }
	        }
	        return leftmax+rightmax;
	            
	            
	            
	        
	    }
	}


