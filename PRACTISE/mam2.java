class mam2
{
	public static void main(String argv[])
	{
		int n=7;
		int c=0;;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("prime:");
		}
		else
		{
			System.out.println("not a prime:");
		}
	}
}