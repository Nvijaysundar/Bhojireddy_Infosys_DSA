import java.util.Arrays;

public class AggressiveCows {
	public static void main(String[] args) {
		int stalls[] = {0,3,4,7,10,9};
		int k = 4;
		int cows = aggersCows(stalls,k);
		System.out.println(cows);
	}
	static int aggersCows(int stalls[],int k)
	{
		int n = stalls.length;
		Arrays.sort(stalls);//{0,3,4,7,9,10}
		int low = 1,high = stalls[n-1]-stalls[0];
		int result = 0;
		//binarySearch
		while(low <= high)
		{
			int mid = (low+high)/2;//5
			if(canweplaceCow(stalls,mid,k))
			{
				result = mid;
				low = mid+1;
			}
			else
				high = mid - 1;
		}
		return result;
	}
												//5
	static boolean canweplaceCow(int[] stalls,
			int dis,int cows)
	{
		int n = stalls.length;
		int cntCows = 1;
		int last = stalls[0];
		for(int i=1;i<n;i++)
		{
			if(stalls[i]-last>=dis)
			{
				cntCows++;
				last = stalls[i];
			}
			if(cntCows>=cows) 
				return true;
		}
		return false;
	}
}
