class exm 
{
	public static void main(String[] args) 
	{
			int n=7;
			int a=0;
			for(int i=0;i<=8;i++)
			{
				if(n%i==0)
				{
					a++;
				}
			}
			if(a==2)
			{
				System.out.println("number is prime:");
			}
			else
			{
				System.out.println("number is not prime:");
			}
			
	}
}
