class Tcubic 
{
	public static void main(String argv[])
	{
		Tcubic obj = new Tcubic();
		
		double res1 = obj.add(2.2,3.3);
		System.out.println(res1);

		double res2 = sub(2.2,7);
		System.out.println(res2);

		double res3 = obj.mul(2,3.3);
		System.out.println(res3);

		double res4 = div(2.2,3.3);
		System.out.println(res4);
	}
	public  double add(double a,double b)
	{
		return a+b;
	}
	public static double sub(double a,int b)
	{
		return a-b;
	}
	public  double mul(int a,double b)
	{
		return a*b;
	}
	public static double div(double a,double b)
	{
		return a%b;
	}
}
