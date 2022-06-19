class Cube
{
	public static void main(String argv[])
	{
		int lhsRes = lhs(2,3);
		int rhsRes = rhs(2,3);
		System.out.println(lhsRes);
		System.out.println(rhsRes);

	}

	public static int lhs(int a,int b)
	{
		int res = (a*a*a)+(b*b*b);
		return res;
	}
	
	public static int rhs(int a,int b)
	{
		int res = (a+b)*((a*a) + (b*b) - (a*b));
		return res;
	}
	

}