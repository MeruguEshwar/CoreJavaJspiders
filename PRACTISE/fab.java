class fab 
{
	public static void main(String[] args) 
	{
		int a,b,n,c,i;
		a=0;
		b=1;
		n=15;

			for(i=0;i<n-2;i++)
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
	}
}
