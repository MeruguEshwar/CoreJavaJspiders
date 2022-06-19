class pal 
{
	public static void main(String[] args) 
	{
		int n=121;
		int rem=0;
		int rev=0;
		int on=n;
		while(n !=0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rev;
		}
		if(on==rev)
		{
			System.out.println("num is pal");
		}
		else
		{
			System.out.println("not pal");
		}
	}
}
