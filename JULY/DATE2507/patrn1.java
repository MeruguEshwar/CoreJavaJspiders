class  patrn1
{
	public static void main(String[] args) 
	{
		int spc=4;
		int str=1;
		for(int i=1;i<=5;i++)
		{
				for(int x=1;x<=spc;x++)
					{
						System.out.print(' ');
					}
					for(int y=1;y<=str;y++)
					{
						System.out.print('*');
					}
				System.out.println();
				spc--;
				str+=2;
		}
		
	}
}
