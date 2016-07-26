package leetcode;

public class SearchMatrix {
	public static void main(String[] args)
	{
		int[][] x=new int[][]{{1,2,3}};
		System.out.println(solution(x,4));
	}
	public static boolean solution(int[][] matrix,int target)
	{
		if(matrix.length==0)
			return false;
		int count=-1;
		int n=matrix[0].length;
		int m=matrix.length;
		System.out.println(m);
		System.out.println(n);
		
		for(int i=0;i<m-1;i++)
		{
			if(target>=matrix[i][0]&target<=matrix[i][n-1])
			{
				count=i;
				break;
			}
		}
		if(count==-1)
		{
			return false;
		}
		else 
		{
			for(int i=0;i<n;i++)
			{
				if(matrix[count][i]==target)
					return true;
				else if(matrix[count][i]>target)
					return false;
			}
		}
		
		return false;
	}

}
