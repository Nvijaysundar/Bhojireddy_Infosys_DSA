class Main{
	public static void main(String[] args) {
		int n =6 ;
		for (int i = 1;i<=n;i++)
		{
			for(int sp = 1;sp<=n-i;sp++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n-1;i>=1;i--)
		{
			for(int sp = 1;sp<=n-i;sp++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}