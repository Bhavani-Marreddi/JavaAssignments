import java.util.Scanner;

public class Absolute 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=scanner.nextInt();
		if(a<0)
		{
			int abs=-a;
			System.out.println("The absolute value of " +a+"is"+a);
		}
		else
		{
			System.out.println("The absolute value of " +a+"is"+a);
		}
		
	}

}
