import java.util.Scanner;
class str3
{
	public static void main(String argv[])
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("enter string name...");
		String s1=scan.next();

		System.out.println("enter the character...");
		char name=scan.next().charAt(0);

		int res =s1.indexOf(name);
		System.out.println("the entered str name is "+res);
	}
}