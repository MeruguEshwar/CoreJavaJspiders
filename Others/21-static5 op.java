
class math
{
public static int sum(int x,int y)
{
	return(x+y);
}
public static int sq(int x)
{
	return(x*x);
}
}
class static5
{
	public static void main(String argv[])
	{
		int a=2,b=5,sum,sq;
		sum=math.sum(a,b);
		sq=math.sq(a);
		System.out.print("\n sum="+sum +"sq="+sq);
	}
}
