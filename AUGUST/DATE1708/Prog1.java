import java.util.Scanner;
class Prog1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter no");
		int a=scan.nextInt();

		boolean res = num(a);
		System.out.println(res);
	}
	public static boolean num(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
