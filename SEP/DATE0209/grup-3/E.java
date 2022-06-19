class E extends D
{
	int z;
	E(int x,int y,int z)
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