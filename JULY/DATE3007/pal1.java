class pal1
{
	public static void main(String[] args) 
	{
		int n=492;
		int rem=0;
		int sum=0;

		while(n !=0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		System.out.println(sum);
			
	}
}
