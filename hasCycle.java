package leetcode;

public class hasCycle {
	public static void main(String[] args)
	{
		hasCycle hc=new hasCycle();
		ListNode ln1=hc.new ListNode(3);
		ListNode ln2=hc.new ListNode(2);
		ListNode ln3=hc.new ListNode(0);
		ListNode ln4=hc.new ListNode(-4);
		ln1.next=ln2;
		ln2.next=ln3;
		ln3.next=ln4;
		ln4.next=null;
		
		System.out.println(solution(ln1));
	}
	public static boolean solution(ListNode head)
	{
		 ListNode temp=head;
	        while(head!=null)
	        {
	            head=head.next;
	            if(head==temp)
	            {
	                return true;
	            }
	        }
	        return false;
	}
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		     }
	}

}
