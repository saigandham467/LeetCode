package leetcode;
import java.util.*;

public class SortColor {
	public int[] solution(int[] nums){
	 int[] count =new int[3];
	 int [] B=new int[nums.length];
	 Arrays.fill(count, 0, 2, 0);
	 for(int i=0;i<nums.length;i++)
     {
         count[nums[i]]+=1;
     }
	 count[1]=count[1]+count[0];
	 count[2]=count[2]+count[1];
	 for(int i=0;i<nums.length;i++)
	 {
		 B[count[nums[i]]]=nums[i];
		 count[nums[i]]-=1;
	 }
     
     return B;
	}

}
