import java.util.Scanner;
class add 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no.....");
		int n = scan.nextInt();
		if(n%2==0)
		{
			System.out.println("num is even.....");
		}
		else
		{
			System.out.println("num is odd......");
		}
	}
}
