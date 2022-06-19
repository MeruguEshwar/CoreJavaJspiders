import java.util.Scanner;
class mani
{
	public static void main(String argv[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter table numbers:");
		int a=scan.nextInt();	
		int b=scan.nextInt();		

		System.out.println("enter the end point:");
		int ep=scan.nextInt();	
		
		for(int i=1;i<ep;i++)	
		{
			System.out.println(a+ " * "+i+"="+(a*i));
		}
		for(int i=1;i<ep;i++)	
		{
			System.out.println(b+ " * "+i+"="+(b*i));
		}
				
	}
}