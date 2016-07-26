package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class twitter {
	int globalcount=0;
	ArrayList<Node> postl;
	Iterator<Node> postit;
	Iterator<Integer> followit;
	Node temp;
	int flag;
	
	public twitter()
	{
		 postl=new ArrayList<Node>();
		 flag=0;
	}
	public void postTweet(int userId, int tweetId)
	{
		//System.out.println(globalcount++);
		postit=postl.iterator();
		while(postit.hasNext())
		{
			temp=postit.next();
			if(temp.followerId.contains(userId))
			{
				temp.tid.add(tweetId);
			}
			if(temp.userid==userId)
			{
				temp.tid.add(tweetId);
				flag=1;
				
			}
			
		}
		if(flag!=1)
		{
			Node node=new Node();
			postl.add(node);
			node.userid=userId;
			node.tid.add(tweetId);
			//node.followerId.add(userId);
		}
	}
	public List<Integer> getNewsFeed(int userId)
	{
		postit=postl.iterator();
		while(postit.hasNext())
		{
			temp=postit.next();
			if(temp.userid==userId)
			{
				ArrayList<Integer> newsl=new ArrayList<Integer>();
				int cap=temp.tid.size()-1;
				int count=0;
				while(count<10 & temp.tid.get(cap)!=null)
				{
					newsl.add(temp.tid.get(cap));
					cap=cap-1;
					count=count+1;
				}
				return newsl;
			}
		}
		return null;
	}
	public void follow(int followerId,int followeeId)
	{
		
		int flagfallow=0;
		postit=postl.iterator();
		while(postit.hasNext())
		{
			temp=postit.next();
			if(temp.userid==followerId)
			{
				temp.followerId.add(followeeId);
				flagfallow=1;
				break;
			}
		}
		if(flagfallow!=1)
		{
			temp=new Node();
			postl.add(temp);
			temp.userid=followerId;
			temp.followerId.add(followeeId);
		}
		
		
	}
	public void unfollow(int followerId,int followeeId)
	{
		if(followerId==followeeId)
			return;
		Node follower = null;
		postit=postl.iterator();
		while(postit.hasNext())
		{
			temp=postit.next();
			if(temp.userid==followerId)
			{
				follower=temp;
				temp.followerId.remove(followeeId);
				break;
			}
		}
		postit=postl.iterator();
		while(postit.hasNext())
		{
			temp=postit.next();
			if(temp.userid==followeeId)
			{
				Iterator<Integer> it=temp.tid.iterator();
				while(it.hasNext())
				{
					int num=it.next();
					follower.tid.remove(num);
				}
			}
		}
		
	}
	
	public class Node 
	{
		int userid;
		ArrayList<Integer> tid;
		ArrayList<Integer> followerId;
	}
	

}
