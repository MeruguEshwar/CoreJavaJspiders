class ptr 
{
	public static void main(String[] args) 
	{
		int a,b,c,n=15,nof=0; 
		a=0;
		b=1;
		for(int i=0;i<=n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			if(c%n==0)
			{
				nof++;
			}
		}
			if(nof==2)
			{
				System.out.println("is prime:");
			}
			else
			{
				System.out.println("not a prime:");
			}
	}
}




