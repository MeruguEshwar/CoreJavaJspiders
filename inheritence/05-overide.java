class a 
{
	public int x=10;
	
}
class b extends a
{
	public int x=20;
	public void showvalues()
	{
		System.out.print("\n a.x="+super.x);
		System.out.print("\n b.x="+x);
	}
}
class overide
{
	public static void main(String argv[])
	{
		b obj=new b();
		obj.showvalues();
	}
}