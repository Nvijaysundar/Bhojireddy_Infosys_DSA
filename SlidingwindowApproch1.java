
public class SlidingwindowApproch1 {
	public static void main(String[] args) {
		int arr[] = {2, -3, 4, -1, -2, 1, 5, -3};
		int k = 3;
		int sum = 0;
		for(int i=0;i<k;i++)
		{
			sum += arr[i];
		}
		int maxsum = sum;
		for(int j = k ;j<arr.length;j++)
		{
			sum += arr[j]  - arr[j-k];
			maxsum = Math.max(maxsum, sum);
		}
		System.out.println(maxsum);
	}
}
