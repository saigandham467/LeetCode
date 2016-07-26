package leetcode;

import java.util.Scanner;

public class Quicksort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int number=sc.nextInt();
		int[] arr=new int[number];
		for(int i=0; i<number;i++)
		{
			System.out.println("enter element");
			arr[i]=sc.nextInt();
			
		}
		partition(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}
	public static void partition(int[] arr)
	{
		int x=arr[0];
		int i=0;
		int temp;
		//int j=1;
		for(int k=1;k<arr.length;k++)
		{
			if(arr[k]<x)
			{
				i=i+1;
				temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
			
		}
		arr[0]=arr[i+1];
		arr[i+1]=x;
	}
}

