class patrn11 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if((i==j) || (j-i==1) || (i+j==11) || (i+j==12))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
