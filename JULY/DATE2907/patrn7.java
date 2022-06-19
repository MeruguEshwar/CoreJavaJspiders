class patrn7
{
	public static void main(String[] args) 
	{
		int spc=4;
		int n=0;
		int n1=1;
		for(int i=1;i<=5;i++)
		{
			for(int x=1;x<=spc;x++)
			{
				System.out.print(' ');
			}
			for(int y=1;y<=n;y++)
			{
				System.out.print(y);
			}
			for(int a=n1;a>=1;a--)
			{
				System.out.print(a);
			}
		spc--;
		n++;
		n1++;
		System.out.println();
		}
	}
}
