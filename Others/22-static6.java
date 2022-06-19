
class A 
{
private static int x;
static
{
	System.out.print("\n static block execution...");
	x=10;
	System.out.print("\n x="+x);
}
}
class static6
{
	public static void main(String argv[])
	{
		A obj1=new A();
		A obj2=new A();
		A obj3=new A();
	}
}