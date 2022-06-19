class patrn2 
{
	public static void main(String[] args) 
	{
		int str=0;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
				str++;
			}
			else
			{
				str--;
			}
			for(int a=1;a<=str;a++)
			{
				System.out.print('*');
			}
		System.out.println();
		}
	}
}
