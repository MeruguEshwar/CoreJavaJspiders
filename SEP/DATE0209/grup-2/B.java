class B extends A
{
	double z;
	B(int m,double n,double z)
	{
		super(m,n);
		this.z=z;
	}
	public void info()
	{
		System.out.println(m);
		System.out.println(n);
		System.out.println(z);
	}
}