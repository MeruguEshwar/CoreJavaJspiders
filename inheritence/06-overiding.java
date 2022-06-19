class a
{
	public void show()
	{
		System.out.print("\n show of a class...");
	}
}
class b extends a
{
	public void show()
	{
		System.out.print("\n show of b class...");
	}
	public void display()
	{
		show();
	
	}
}
class overiding
{
	public static void main(String argv[])
	{
		b obj=new b();
		obj.display();
	}
}