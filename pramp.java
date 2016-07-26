package leetcode;
import java.util.*;

public class pramp {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      String input=sc.next();
	      
	      String test =  "practice makes perfect. get perfect by practice. just practice!";
	      wordcount(test);
	      
	}
	public static ArrayList wordcount(String str)
	{
		ArrayList<String> al=new ArrayList<String>();
		 StringTokenizer st=new StringTokenizer(str);
		 TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		 while(st.hasMoreTokens())
		 {
			String tok=st.nextToken();
			if(tm.containsKey(tok))
			{
				tm.put(tok, tm.get(tok)+1);
			}
			else
			{
				tm.put(tok,1);
			}
			
		 }
		for(String key:tm.keySet())
		{
			al.add(key+" : "+tm.get(key));
		}
		return al;
		
	}
}
