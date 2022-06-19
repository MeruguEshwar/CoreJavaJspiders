class mam1
{
	public static void main(String argv[])
	{
		int a=0;
		int b=1;
		int n=8;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n-2;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}