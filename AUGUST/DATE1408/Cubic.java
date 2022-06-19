class Cubic
{	
	public static void main(String argv[])
	{
		int lhsRes = lhs(3,2);
		int rhsRes = rhs(3,2);
		System.out.println(lhsRes+"="+rhsRes);
	}


	public static int lhs(int a,int b)
	{
		int res=(a*a*a)-(b*b*b);
		return res;
	}

	public static int rhs(int a,int b)
	{
		int res=(a*a*a)-(b*b*b)-(3*a*b*(a-b));
		return res;
	}
}