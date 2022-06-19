import java.util.Scanner;
class area 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter height....");
		int h=scan.nextInt();
		System.out.println("enter width....");
		int b=scan.nextInt();
		
		double c=0.5*h*b;
		System.out.print(c);
	}
}
