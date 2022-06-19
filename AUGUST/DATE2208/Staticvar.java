class Staticvar
{
	static int i=10;
	double j=5.5;
	public static void main(String argv[])
	{
		System.out.println(i);
	
		Staticvar obj=new Staticvar();
		System.out.println(obj.j);
	}
}