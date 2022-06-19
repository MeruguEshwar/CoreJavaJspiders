class  Prog3
{
	public void test() 
	{
		System.out.println("move 5 km");
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Prog3 obj=new Prog3();
		obj.test();
		System.out.println("main ends");
	}
}
