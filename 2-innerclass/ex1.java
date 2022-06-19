class sample
{
	public int x=10;
	private int y=20;
	protected int z=30;
	int a=40;
}
class ex1
{
	public static void main(String argv[])
	{
		sample obj=new sample();
		System.out.print("\n obj.x="+obj.x);
		System.out.print("\n obj.z="+obj.z);
		System.out.print("\n obj.a="+obj.a);
	}
}


		