class A
{
	public void add(int x,int y)
	{
		System.out.print("\n add="+(x+y));
	}
}
class B extends A
{
	A obja=new A();
	public void add(int x,int y)
	{
		obja.add(x,y);
	}
}
class delig
{
	public static void main(String argv[])
	{
		B objb=new B();
		objb.add(10,20);
	}
}
