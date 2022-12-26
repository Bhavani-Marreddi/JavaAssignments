public class Example2 {
	public static void main(String[] args) {
		int n=3;
		for(int i=n;i>=1;i--)
		{
			for(int s=2;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
