import java.util.Scanner;

public class TotalExpenses3 {
	public static void main(String args[])
	{

		double quantity,price,amount,discount;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Quantity and Price:");
		  quantity = sc.nextFloat();
		  price = sc.nextFloat();
 		amount=quantity*price;
		if(amount>5000)
		{
			discount=amount*0.05;
			amount=amount-discount;

		}
		
	System.out.println(amount);
		
	}

}
