class patrn10
{
	public static void main(String argv[])
	{	
		int n=1;
		char alp='a';
		for(int i=1;i<=5;i++)
		{
			for(int a=1;a<=5;a++)
			{
				if(i%2 != 0)
				{
					System.out.print(n);
					n++;
					System.out.print(' ');
				}
				else
				{
					System.out.print(alp);
					alp++;
					System.out.print(' ');
				}

			}
		System.out.println();
		}
	}
}