
public class MaxContigeousSubArray {
	public static void main(String[] args) {
		int arr[] = {2, -3, 4, -1, -2, 1, 5, -3};
		int maxSum = arr[0];
		int curr = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			curr= Math.max(arr[i],curr+arr[i]);
			maxSum = Math.max(curr, maxSum);
		}
		System.out.println(maxSum);
	}
}
