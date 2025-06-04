import java.util.Arrays;

public class KthSmallest {
	public static void main(String[] args) {
		int arr[][] = {{1,5,8},{10,11,13},{12,13,14}};
		int res[] = new int[arr.length*arr[0].length];
		int m=0,k=8;
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				res[m] = arr[i][j];
				m++;
			}
		}
		Arrays.sort(res);
		System.out.println(res[k-1]);
	}
}
