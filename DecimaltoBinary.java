
public class DecimaltoBinary {
	static String decimalToBinary(int n)
	{
		StringBuffer sb = new StringBuffer();
		while(n>0)
		{
			int rem = n%2;
			sb.append(rem);
			n/=2;
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		String binary = decimalToBinary(15);
		int count = 0;
		for(int i=0;i<binary.length();i++)
		{
			if(binary.charAt(i)=='1')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
