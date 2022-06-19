class sample
{
	private int x;
	public void setx(int a)
	{
		x=a;
	}
	public void show()
	{
		System.out.print("\n x="+x);
	}
}
class ex2
{
	public static void main(String argv[])
	{
		sample obj=new sample();
		obj.setx(100);
		obj.show();
		
	}
}
