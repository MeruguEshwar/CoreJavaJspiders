import java.util.Scanner;
class table 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter table nuber:");
			int n=scan.nextInt();
			for(int k=1;k<=10;k++)
				{
					System.out.println(n+ " * "+k+"="+(n*k));
				}
	}
}
