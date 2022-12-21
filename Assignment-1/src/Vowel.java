import java.util.Scanner;

public class Vowel {
	public static void main(String args[]) {
		for (int i=0;i<=5;i++)
			System.out.println(i);
	char ch;
	Scanner sc= new Scanner(System.in);
	System.out.print("Please Enter any Character =  ");
	ch = sc.next().charAt(0);
	
	if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))  {
		System.out.println(ch + " is an Alphabet");
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is Vowel");
			break;
		default:
			System.out.println(ch + " is Consonant");	
		}
	}
	else {
		System.out.println(ch + " is Not an Alphabet");
	}

}
}
