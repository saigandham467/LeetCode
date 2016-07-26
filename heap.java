package leetcode;


import java.util.Scanner;
public class heap
{
	static int heapsize;
	public static void main(String[] args)
{
	System.out.println("enter the number of elements in array");
	Scanner sc = new Scanner(System.in);
	int i=sc.nextInt();
	int[] arr=new int[i];
	System.out.println("enter numbers");
	for(int k=0; k<i; k++)
	{
		System.out.println("enter number");
		arr[k]=sc.nextInt();
	}
	heapsort(arr);
}
	public static void heapsort(int[] arr)
	{
		int temp; 
		buildmaxheap(arr);
		heapsize=arr.length;
			for(int i=arr.length-1;i>0;i--)
			{
				temp=arr[0];
				arr[0]=arr[i];
				heapsize=heapsize-1;
				maxheapify(arr,0);
			}
	}
	public static void buildmaxheap(int[] arr)
	{
		heapsize=arr.length;
		for(int i=arr.length/2;i>=0;i--)
		{
			maxheapify(arr,i);
		}
	}
	public static void maxheapify(int[] arr,int i)
	{
		int l=arr[2*i];
		int r=arr[(2*i)+1];
		
	}
}
