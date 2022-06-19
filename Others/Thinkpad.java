class Thinkpad 
{
	public static int lhs(int a,int b)
	{
		int res = ((a*a*a)+(b*b*b));
		return res;
	}
	public static int rhs(int a,int b)
	{
		int res = ((a*a)+(b*b)-(a*b));
		return res;
	}
	public static void main(String[] args) 
	{
		int lhsres = lhs(2,3);
		int rhsres = rhs(2,3);
		System.out.println("lhsres is"+lhsres);
		System.out.println("rhsres"+rhsres);
	}
}
