class C extends B
{
	int x;
	int y;
	int z;
	C(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
	public void info()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}