class patrn5 
{
	public static void main(String[] args) 
	{
		int spc=4;
		int n=1;
		for(int i=1;i<=7;i++)
		{
			for(int x=1;x<=spc;x++)
			{
				System.out.print(' ');
			}
			for(int y=1;y<=n;y++)
			{
				System.out.print('*');
			}
			if(i<=3)
			{
				spc--;
				n++;
			}
			else
			{
				spc++;
				n--;
			}
		System.out.println();
		}
	}
}
