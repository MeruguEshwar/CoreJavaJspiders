class Sample
{
	static int i=10;
	static double j=5.5;
	int a=8;
	double b=1.1;
	public static void main(String argv[])
	{
		System.out.println(i);
		System.out.println(j);
	
		Sample obj=new Sample();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}