class Multi 
{
	public static void main(String argv[])
	{
		nani(2,3);

		Multi m=new Multi();
		m.nani(2,3,4);

		nani(5,2.2);

		double res=nani(2.2,3,2.5);
		System.out.println(res);
	}

	public static void nani(int a,int b)
	{
		System.out.println(a*b);
	}

	public void nani(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}

	public static void nani(int a,double b)
	{
		System.out.println(a*b);
	}

	public static double nani(double a,int c,double b)
	{
		return(a*b*c);
	}
}
	 
	 