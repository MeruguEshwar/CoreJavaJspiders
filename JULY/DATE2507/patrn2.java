class patrn2 
{
	public static void main(String[] args) 
	{
		int str=9;
		int spc=0;
		for(int i=1;i<=5;i++)
		{
			for(int y=1;y<=spc;y++)
			{
				System.out.print(' ');
			}

			for(int x=1;x<=str;x++)
			{
				System.out.print('*');
			}
			
			str-=2;
			spc++;
			System.out.println();
		}
	}
}
