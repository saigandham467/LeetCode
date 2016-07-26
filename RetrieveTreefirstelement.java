package leetcode;
import java.util.*;

public class  RetrieveTreefirstelement {
	Queue<node> queue;
	Iterator<node> it;
	public RetrieveTreefirstelement()
	{
		 queue=new LinkedList<node>();
		 
		
	}
	public void retrieveelement(node n)
	{
		queue.add(n);
		fun(queue);
	}
	public void fun(Queue<node> queue)
	{
		System.out.println(queue.peek().data);
		int num=queue.size();
		while(num-->0)
		{
			it=queue.poll().child.iterator();
			while(it.hasNext())
			{
				queue.add(it.next());
			}
			
		}
		if(queue!=null)
			fun(queue);
		
	}
	
	
	public class node
	{
		int data;
		ArrayList<node> child;
	}

}
