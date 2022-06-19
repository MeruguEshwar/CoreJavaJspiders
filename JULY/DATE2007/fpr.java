class fpr
{
	public static void main(String[] args) 
	{
		int a=0,b=1,n=15;
		for(int i=1;i<=n-2;i++)
		{
			int c=a+b;
				if(c%2==0)
				{
					System.out.println(c);
				}
				else
				{		
					System.out.println();
				}
				a=b;
				b=c;
		}

	}
}
