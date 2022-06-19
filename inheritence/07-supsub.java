class A
{
	public void show()
	{
		System.out.print("\n show() of A...");
	}
}
class B extends A
{
	public void display()
	{
		System.out.print("\n display() of B...");
	}
}
class supsub
{
	public static void main(String argv[])
	{
		B obj=new B();
		obj.show();
	}
}