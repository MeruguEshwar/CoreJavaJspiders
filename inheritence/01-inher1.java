class a
{
	private int x=10;
	public int y=20;
	protected int z=30;
	int a=40;
}
class b extends a
{
	public void show()
	{
	
		System.out.print("\n public y="+y);
		System.out.print("\n protected z="+z);
		System.out.print("\n a="+a);
	}
}
class inher1
{
	public static void main(String argv[])
	{
		b objb=new b();
		objb.show();
	}
}