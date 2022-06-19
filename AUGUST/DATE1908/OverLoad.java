class OverLoad 
{
	public static void test(int a) 
	{
		System.out.println("In test with int arg...");
	}

	public static void test(double a) 
	{
		System.out.println("In test with double arg...");
	}

	public static void test(int a,double b) 
	{
		System.out.println("Hello World!");
	}

	public static void main(String[] args) 
	{
		test(9,5.5);
	}
}
