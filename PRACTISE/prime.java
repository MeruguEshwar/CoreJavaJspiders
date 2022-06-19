class prime 
{
	public static void main(String[] args) 
	{
		int i,n,nof;
		nof=0;
		n=5;
		for(i=1;i<=5;i++)
			{
				if(n%i==0)
					{
						nof++;
					}
			}
			if(nof==2)
				{
					System.out.println("Is prime.....");
				}
				else
				{
					System.out.println("Not a prime.....");
				}
	}
}
