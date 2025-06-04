import java.util.Arrays;

public class LongestIncreasingSubsesquenec {
	public static void main(String[] args) {
		int[] nums = {10,9,2,5,3,7,101,10};
		System.out.println(longestIncreasing(nums));
	}
	static int longestIncreasing(int[] nums)
	{
		if(nums == null || nums.length==0)
			return 0;
		int[] dp = new int[nums.length];
		Arrays.fill(dp,1);
		int maxlen = 1;
		for(int i=1;i<nums.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(nums[i]>nums[j])
				{
					dp[i] = Math.max(dp[i],dp[j]+1);
				}
			}
//			for(int k=0;k<dp.length;k++)
//				System.out.print(nums[k]+"-"+dp[k]+" ");
//			System.out.println();
			maxlen = Math.max(maxlen, dp[i]);
		}
		return maxlen;
	}
}
