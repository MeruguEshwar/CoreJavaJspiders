class patrn1 
{
	public static void main(String[] args) 
	{
		int str=1;
		for(int i=1;i<=9;i++)
		{
			for(int a=1;a<=str;a++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=4)
			{
				str++;
			}
			else
			{
				str--;
			}
		}
		
	}
}
