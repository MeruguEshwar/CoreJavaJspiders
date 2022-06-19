class patrn11
{
	public static void main(String argv[])
	{	
		int s=1;
		int spc=4;
		for(int i=1;i<=5;i++)
		{
			for(int a=1;a<=spc;a++)
			{	
				System.out.print(' ');
			}
			for(int b=1;b<=s;b++)
			{
				System.out.print('*');
			}
		spc--;
		s+=2;
		System.out.println();
		}
	}
}