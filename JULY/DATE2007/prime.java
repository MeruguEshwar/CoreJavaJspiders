class prime 
{
	public static void main(String[] args) 
	{
		int nof=0;
		int n=2;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				nof++;
			}
		}
		if (nof==2)
		{
			System.out.println("num is prime");
		}
		else
		{
			System.out.println("not a prime");
		}
	}
}
