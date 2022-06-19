class a 
{
	public int x=10;
	public void showvalues()
	{
		System.out.print("\n x="+x);
	}
}
class b extends a
{
	public int x=20;
	public void showvalues()
	{
		System.out.print("\n x="+x);
		System.out.print("\n x="+x);
	}
}
class inhover
{
	public static void main(String argv[])
	{
		b obj=new b();
		obj.showvalues();
	}
}