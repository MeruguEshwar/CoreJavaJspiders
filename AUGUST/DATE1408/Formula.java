class Formula
{
	public static void main(String argv[])
	{
		int lhsRes = lhs(2,3);
		System.out.println(lhsRes);
	}

	public static int lhs(int a,int b)
	{
		int res = (a*a)-(b*b);
		return res;
	}
	

}