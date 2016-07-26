package leetcode;

public class Removennode {
	
	public ListNode removenth(ListNode head,int n)
	{
		ListNode temp=head;
		
		int count=1;
		while(head.next!=null)
		{
			head=head.next;
			count=count+1;
			
		}
		if(count<n)
		{
			return null;
		}
		else if(count==0)
		{
			return null;
		}
		else if(count==1&&n==1)
		{
			return null;
		}
		else
		{
			head=temp;
			count=count-n;
			if(count==0)
			{
				temp=head.next;
				head=null;
				return temp;
			}
			for(int i=1;i<count;i++)
			{
				head=head.next;
				
			}
			ListNode ln=head.next;
			ln=ln.next;
			head.next=ln;
			return temp;
			
			
		}
		
		
		//return null;
	}
	
	
	
	
	
	public class ListNode
	{
		int val;
		ListNode next;
		ListNode(int x)
		{
			val=x;
		}
	}

}
