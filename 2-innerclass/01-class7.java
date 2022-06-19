
class A 
{
	private int x=10;
	class B
{
	public void show()
	{
		System.out.print("\n x="+x);
	}
}
public void display()
{
	B objb=new B();
	objb.show();
}
}
class class7
{
	public static void main(String argv[])
	{
		A obj=new A();
		obj.display();
	}
}