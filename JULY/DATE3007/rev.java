class rev 
{
	public static void main(String[] args) 
	{
		int n=8439;
		int rem=0;
		int rev=0;

		while(n != 0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
	}
}
