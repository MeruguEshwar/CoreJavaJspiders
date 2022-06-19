import java.util.Scanner;
class Add
{
	public static void main(String argv[])
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("enter no");
		int a=scan.nextInt();

		
		boolean res=addoreven(3);
		System.out.println(res);
	}

		public static boolean addoreven(int b)
		{
			if(b%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

}
