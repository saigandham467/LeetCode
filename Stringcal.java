package leetcode;

public class Stringcal {
	public String method(String str)
	{
		StringBuffer sb=new StringBuffer();
		String temp=str;
		int flag=0;
		int i=0;
		StringBuffer sb1=new StringBuffer();
		while(flag==0)
		{
			char temp1=str.charAt(i);
			if(temp1==str.charAt(i+1))
			{
				i=i+2;
			}
			else
			{
				sb1.append(temp1);
				i=i+1;
			}
			if(i==str.length())
			{
				flag=1;
				for(int j=0;j<sb1.length();j++)
				{
					if(sb1.charAt(j)==sb1.charAt(j+1))
					{
						flag=0;
					}
				}
			}
		}
		String some=sb1.toString();
		return some;
		
	}

}
