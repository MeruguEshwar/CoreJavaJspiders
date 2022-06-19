class Prog2 
{
	public static void main(String[] args) 
	{
		Prog2 obj=new Prog2();
		double res1 = obj.add(3.1,2.2);
		System.out.println(res1);

		double res2 = sub(7.9,2);
		System.out.println(res2);

		double res3 = obj.div(5,3);
		System.out.println(res3);

		String res4 = concat("nani",'M');
		System.out.println(res4);
	}
	public double add(double a,double b)
	{
		return a+b;
	}
	public static double sub(double a,int b)
	{
		return a-b;
	}
	public double div(int a,double b)
	{
		return a%b;
	}
	public static String concat(String a,char b)
	{
		return a+b;
	}
}
