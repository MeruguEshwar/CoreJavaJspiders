class patrn3
{
	public static void main(String[] args) 
	{
		int num=1;
		int spc=3;
		int str=1;
		for(int i=1;i<=4;i++)
		{
			for(int x=1;x<=spc;x++)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=str;y++)
			{
				System.out.print(num+" ");
				num++;
			}
		spc--;
		str++;
		System.out.println();
		}
	}
}
