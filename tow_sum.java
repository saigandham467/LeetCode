package leetcode;

import java.util.Scanner;

public class tow_sum {
	static Scanner  sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array values");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("enter the target value");
		int target=sc.nextInt();
		int sol[]=twosum(arr,target);
		System.out.println(sol[0]);
		System.out.println(sol[1]);
		
		}

	public static int[] twosum(int[] nums,int target)
	
	{int []solution=new int[2];
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					solution[0]=i;
					solution[1]=j;
					//return solution;
				}
			}
		}
		return solution;
	}

}
