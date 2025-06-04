
public class KernighanAlgo {
	public static void main(String[] args) {
		int n = 13,count = 0;
		while(n>0)
		{
			n = n&(n-1);
			count++;
		}
		System.out.println(count);
	}
}
