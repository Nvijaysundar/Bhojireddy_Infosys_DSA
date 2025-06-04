
public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {1,3,3,5,7};	
		System.out.println(lbSearch(arr,3));
	}
	static int lbSearch(int [] arr , int key)
	{
		int lower = 0,higher = arr.length-1;
		while(lower<higher)
		{
			int mid = (lower+higher)/2;
			if(key>=arr[mid])
			{
				lower = mid +1;
			}
			else
			{
				higher = mid;
			}
		}
		return lower;
	}
}
