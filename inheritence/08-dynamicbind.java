class a
{
	public void show()
	{
		System.out.print("\n show of a()....");
	}
}
class b extends a
{
	public void show()
	{
		System.out.print("\n display of b()....");
	}
}
class c extends b
{
	public void show()
	{
		System.out.print("\n show of c()....");
	}
}
class dyanamic
{
	public static void main(String argv[])
	{
		a r;
		a obja=new a();
		b objb=new b();
		c objc=new c();
		r=obja;
		r.show();
		r=objb;
		r.show();
		r=objc;
		r.show();
	}
}