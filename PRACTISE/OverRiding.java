
	class A
	{
		public  void show()
		{
				System.out.println("show of A cls:");
		}
	}
	class B extends A
	{
		public  void show()
		{
				System.out.println("Show of b cls");
		}
		public void display()
		{
			show();
			show();
		}
	}
class OverRiding
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.display();
		System.out.println("Hello World!");
	}
}
