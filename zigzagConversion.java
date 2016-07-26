package leetcode;

public class zigzagConversion {

	public static void main(String[] args) {
		
		String st="paypalishiring";
		int row=3;
		convert(st,row);

	}
	public static String convert(String str,int rownum)
	{
		StringBuffer sb=new StringBuffer();
		//char c1;
		//char[][] arr=new char[rownum][str.length()];
		if(rownum==1)
		{
			return str;
		}
		int p=0;
		int var=0;
		for(int i=0;i<rownum;i++)
		{
			
			for(int j=p;j<str.length();j+=rownum)
			{
		
				str.charAt(j);
				sb.append(str.charAt(j));
				
					
				}
			p=p+1;
			}
			
		
		System.out.println(sb);
		
		return str;
		
		
	}

}
