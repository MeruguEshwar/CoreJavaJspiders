class patrn4
{
	public static void main(String[] args) 
	{
		int spc=3;
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int x=1;x<=spc;x++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=num;j++)
			{
				System.out.print(i);
			}
			spc--;
			num+=2;
			System.out.println();
		}
	}
}
