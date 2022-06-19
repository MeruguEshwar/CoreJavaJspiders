class patrn1
{
	public static void main(String argv[])
	{
		int str=1;
		int spc=3;
		for(int i=1;i<=7;i++)
		{
			for(int x=1;x<=spc;x++)
			{
				System.out.print(' ');
			}
			for(int y=1;y<=str;y++)
			{
				System.out.print('*');
			}
			if(i<=3)
			{
				spc--;
				str+=2;
			}
			else
			{
				spc++;
				str-=2;
			}
		System.out.println();
		}
	}
}