class  ass1
{
	public static void main(String[] args) 
	{
		int c,n=15;
		int nof=0;
		int a=0;
		int b=1;
		for(int i=0;i<n-2;i++)
		{
			c=a+b;
			if(c%n==0)
			{
				nof++;
			}
		}
			if(nof == 2)
			{
				System.out.println("is prime");
			}
			else
			{
				System.out.println("not prime:");
			}
	}
}
