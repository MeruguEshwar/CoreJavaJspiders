import java.util.Scanner;
class Concati 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the table number:");
		int n=scan.nextInt();
		for(int i=1;i<10;i++)
		{
			System.out.println(n  +"*"+  i  +"="+ (n*i));
		}
	}
}
