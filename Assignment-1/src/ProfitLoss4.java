import java.util.Scanner;

public class ProfitLoss4 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int cp,sp,result;

		System.out.println("Enter cost price of item : ");
		cp = sc.nextInt();
		System.out.println("Enter selling price of item : ");
		sp = sc.nextInt();

		result=sp-cp;

		if(result>0)
			System.out.println("Profit :" + result);
		else
			if(result<0)
				System.out.println("Loss :" + result);
			else
				System.out.println("No profit no loss");
	}


}
