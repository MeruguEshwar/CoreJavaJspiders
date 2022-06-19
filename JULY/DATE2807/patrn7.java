class patrn7
{
	public static void main(String[] args) 
	{
		int spc=3;
		int alp=65;
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int x=1;x<=spc;x++)
			{
				System.out.print(' ');
			}
			for(int j=1;j<=num;j++)
			{
				System.out.print((char) alp);
			}
			alp++;
			spc--;
			num+=2;
		System.out.println();
		}
	}
}
