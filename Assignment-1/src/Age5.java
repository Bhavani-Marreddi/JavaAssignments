import java.util.Scanner;

public class Age5 {
	public static void main(String[] args) {
		int Ram,Shyam,Ajay;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Ages of Ram,Shyam,Ajay");
		System.out.print("Ram's : ");
		Ram= sc.nextInt();
		System.out.print("Shyam's : ");
		Shyam= sc.nextInt();
		System.out.print("Ajay's : ");
		Ajay= sc.nextInt();
		if(Ram<Shyam && Ram<Ajay)
		{
			System.out.println("Ram is youngest");
		}
		if(Shyam<Ram && Shyam<Ajay)
		{
			System.out.println("Shyam is youngest");
		}
		else if(Ajay<Ram && Ajay<Shyam)
		{
			System.out.println("Ajay is youngest");
		}
	}

}
