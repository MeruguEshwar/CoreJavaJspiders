class SmpleIntrst
{
	public static void main(String argv[])
	{
		double mnthlyPay = si(1000,2,3.5);
		System.out.println(mnthlyPay);
	}

	public static double si(int p,int t,double r)
	{
		double res = (p*t*r)/100;
		return res;
	}
}
		