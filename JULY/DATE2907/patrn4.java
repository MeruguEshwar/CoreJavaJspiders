class patrn4
{
	public static void main(String[] args) 
	{
		int spc=4;
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int x=1;x<=spc;x++)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=n;y++)
			{
				System.out.print(y);
			}
			for(int z=n;z>=1;z--)
			{
				System.out.print(z);
			}
		spc--;
		n++;
		System.out.println();
		}
	}
}
