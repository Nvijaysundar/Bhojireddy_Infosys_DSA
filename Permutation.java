import java.util.ArrayList;
import java.util.List;
public class Permutation {
	public static void main(String[] args) {
		int nums[] = {1,2,3};
		List<List<Integer>> res = permutation(nums);
		
		System.out.println(res.toString());
 	}
	static void helper(int[] nums,int start,
			List<List<Integer>> result,List<Integer> curr)
	{
		result.add(new ArrayList<>(curr));	
		for (int i=start;i<nums.length;i++)
		{
			curr.add(nums[i]);
			helper(nums,i+1,result,curr);
			curr.remove(curr.size()-1);
		}
	}
				
	private static List<List<Integer>> permutation(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		helper(nums,0,result,new ArrayList<>());
		return result;
	}
}
