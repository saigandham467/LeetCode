package leetcode;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordCount {
	public HashMap<String,Integer> solution(String doc)
	{
		TreeMap<String,Integer> hm=new TreeMap<String,Integer>((Map<? extends String, ? extends Integer>) new mycomp());
			
		StringTokenizer st=new StringTokenizer(doc);
		while(st.hasMoreTokens())
		{
			String str=st.nextToken();
			if(hm.containsKey(str))
			{
				hm.put(str, hm.get(str)+1);
			}
			else
			{
				hm.put(str, 1);
			}
			
		}
		//Collections.sort();
		return null;
	}
	
	public class mycomp implements Comparator<Map.Entry<String, Integer>>{

		@Override
		public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
			// TODO Auto-generated method stub
			return o2.getValue().compareTo(o1.getValue());
		
			
		}
		
		
		
		
	}
	

}
