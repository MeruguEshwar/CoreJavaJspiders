class Pad
{
	public static void main(String[] args) 
	{
		double lhsres = lhs(10,20);
		double rhsres = rhs(1,2,3.5);
		System.out.println(lhsres);
		System.out.println(rhsres);
	}
	public static double lhs(int a,int b)
	{
		double res = (a*a*a)+(b*b*b);
		return res;
	}
	public static double rhs(int a,int b,double c)
	{
		double res = (a*a)+(b*b)-(a*b);
		return res;
	}
}
