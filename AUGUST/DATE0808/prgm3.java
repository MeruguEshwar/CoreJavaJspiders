import java.util.Scanner;
class  prgm3
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the string....");
		String s1=scan.next();

		System.out.println("Enter the start pos....");
		int sp=scan.nextInt();

		String res=s1.substring(sp);
		System.out.println(res);
	}
}
