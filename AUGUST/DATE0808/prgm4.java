import java.util.Scanner;
class  prgm4
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the string....");
		String s1=scan.next();

		String res1 = s1.toUpperCase();
		String res2 = s1.toLowerCase();

		System.out.println("uppercase string : "+res1);
		System.out.println("lowercase string : "+res2);
	}
}
