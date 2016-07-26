package leetcode;


public class simplecalculator {
	public static void main(String[] args)
	{
		int exp=calculation("0");
		System.out.println(exp);
	}

	public static int calculation(String s)
	{
		int count=0;
		int counttemp=0;
		String operator=null;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='(')
			{
				
			}
			else if(s.charAt(i)==')')
			{
				
			}
			else if(s.charAt(i)==' ')
			{
				
			}
			else if(s.charAt(i)=='+')
			{
				operator="+";
			}
			else if(s.charAt(i)=='-')
			{
				operator="-";
			}
			else
			{
				count= Integer.parseInt(s.substring(i,i+1));
				if(count>=0||count<10)
				{
					if(operator==null)
					{
						counttemp=count;
					}
					else
					{
						if(operator.equals("+"))
						{
							counttemp+=count;
						}
						else if(operator.equals("-"))
						{
							counttemp-=count;
						}
					}
				}
			}
			
		}
		return counttemp;
	}

}
