class pat1
{
	public static void main(String argv[])
	{
		int spc=3;
		int str=1;
		int num=1;
		for(int  i=1;i<=4;i++)
		{
			for(int a=1;a<=spc;a++)
			{
					System.out.print(' ');
			}

			for(int y=1;y<=str;y++)
			{
					System.out.print(num+ " ");
					num++;
			}
			spc--;
			str++;
			System.out.println();
		}
	}
}