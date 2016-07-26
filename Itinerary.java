package leetcode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Itinerary {
	
	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of itinerary");
		int m=sc.nextInt();
		
		String[][] arr=new String[m][m];
		System.out.println("enter names of itinerary");
		for(int i=0;i<m;i++)
		{
			System.out.println("enter itinerary value");
			for(int j=0;j<2;j++)
			{
			arr[i][j]=sc.next();
			System.out.println(arr[i][j]);
			}
		}
		List<String> some=new ArrayList();
		some=findItinerary(arr);
		//Iterator<String> it=some.iterator();
		
		
		
		
			System.out.print(some);
		
		
		
		
	}
	public static List<String> findItinerary(String[][] tickets) 
	{
		int count = 0;
		String temp ="JFK";
		List<String> li=new ArrayList();
		/*
		for(int i=0;i<tickets.length;i++)
		{
			if(tickets[i][0].equals("JFK"))
			{
				count++;
		     li.add("JFK");
			}
		
		     temp=tickets[i][1];
		     
		     li.add(temp);
		     
		    break;
			}
			System.out.println("out of break");
			
			
		}*/
		
		
		
		while(li.size()<tickets.length+1)
		{
			
		for(int i=0;i<tickets.length;i++)
		{ 
			
			if(tickets[i][0].equals(temp))
			{
				
				//System.out.println("out of break1");
			    
		        li.add(tickets[i][1]);
				temp=tickets[i][1];
				
				
				
			}
		
			
		}
		
		}
		
		
		return li;
		
	}

}
