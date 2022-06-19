class patrn7
{
	public static void main(String argv[])
	{	
		int  s=4;
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int a=1;a<=s;a++)
			{
				System.out.print(' ');
			}
			for(int b=1;b<=n;b++)
			{
				System.out.print('*');
			}
		s--;
		n++;
		System.out.println();
		}
	}
}