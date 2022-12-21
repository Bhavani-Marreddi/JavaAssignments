import java.util.Scanner;

public class Angle6 
{
	public static void main(String[] args) 
	{
		 int a, b, c, sum;
		   System.out.println("Enter three angles of a triangle: ");
			Scanner sc= new Scanner(System.in);
			a= sc.nextInt();
			b= sc.nextInt();
			c= sc.nextInt();
		    sum = a+b+c;

		    if (sum == 180)
		    	System.out.println("Triangle is valid");
		    else
		    	System.out.println("Triangle is not valid");
		
	}

}
