class patrn6
{
	public static void main(String[] args) 
	{
		int spc=4;
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int x=1;x<=spc;x++)
			{
				System.out.print(' ');
			}

			for(int y=n;y>=1;y--)
			{
				System.out.print(y);
			}
			for(int z=1;z<=n;z++)
			{
				System.out.print(z);
			}	
		spc--;
		n++;
		System.out.println();
		}
	}
}
