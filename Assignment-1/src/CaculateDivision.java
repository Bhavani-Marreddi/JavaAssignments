import java.util.Scanner;

public class CaculateDivision {
        public static void main(String[] args) 
	{
		int sub1,sub2,sub3,sub4,sub5,percentage;
		System.out.println("Enter marks of five subjects : ");
		Scanner s = new Scanner(System.in); 
		sub1 = s.nextInt();
		sub2 = s.nextInt();
		sub3 = s.nextInt();
		sub4 = s.nextInt();
		sub5 = s.nextInt();
		percentage=(sub1+sub2+sub3+sub4+sub5)/5;
		if(percentage>=60)
			System.out.println("Ist division");
		else if(percentage>=50)
			System.out.println("IInd division");
		else if(percentage>=40)
			System.out.println("IIIrd division");
		else
			System.out.println("Fail") ;
	}

}
