import java.util.Scanner;
class table1
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
			System.out.println(" enter the mul table...");
			int n=scan.nextInt();

			System.out.println("enter the start point");
			int sp=scan.nextInt();
			
			System.out.println("enter the end point");
			int ep=scan.nextInt();

			for(int i=sp;i<=ep;i++)
			{
				System.out.println( n +"*" +i+"="+(n*i));
			}
	}
}
