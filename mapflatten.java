package leetcode;

import java.util.HashMap;

public class mapflatten{
	HashMap<String,Integer> resultmap=new HashMap<String,Integer>();
	public static void main(String[] args)
	{
		
		
	}
	public HashMap<String,Integer> solution(HashMap<String,Object> hm)
	{
		for(String key:hm.keySet())
		{
			Object obj=hm.get(key);
			if(obj instanceof Integer)
			{
				resultmap.put(key,(Integer) obj );
			}
			else 
			{
				helper(hm,key,key);
			}
		}
		return null;
	}
	public void helper(HashMap<String,Object> hm,String key,String prefix)
	{
		HashMap<String,Object> helpermap=(HashMap<String,Object>)hm.get(key);
		for(String key1:helpermap.keySet())
		{
			Object obj=hm.get(key1);
			if(obj instanceof Integer)
			{
				resultmap.put(prefix+"."+key1,(Integer) obj );
			}
			else 
			{
				helper(helpermap,key1,prefix+"."+key1);
			}
		}
		
		
	}
	
}


