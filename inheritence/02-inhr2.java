class a
{
	public void sum(int x,int y)
	{
		System.out.print("\n sum="+(x+y));
	}
	public void sq(int x)
	{
		System.out.print("\n sq="+(x*x));
	}
}
class b extends a
{
	public void mult(int x,int y)
	{
		System.out.print("\n mult="+(x*y));
	}
}
class inhr2
{
	public static void main(String argv[])
	{
		b obj=new b();
		obj.sum(1,2);
		obj.sq(5);
		obj.mult(2,3);
	}
}