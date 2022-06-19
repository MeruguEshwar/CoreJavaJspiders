class patrn3
{
	public static void main(String[] args) 
	{
		int num=1;
		int spc=2;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(i + " ");
			}
			spc--;
			num++;
			System.out.println();
		}
	}
}
