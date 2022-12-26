public class Example6{
	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int s=2;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if((j==1)||(j==2*i-1))
				{
					System.out.print("1");
				}else
				{
				System.out.print("*");
			}
			}
			System.out.println();
		}
		for(int i=2;i>=1;i--)
		{
			for(int s=2;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if((j==1)||(j==2*i-1))
				{
					System.out.print("1");
				}else
				{
				System.out.print("*");
			}
			}
			System.out.println();
		}
}
}