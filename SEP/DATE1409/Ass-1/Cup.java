class Cup 
{
	String color;
	String cupType;
	int  capacity;

	Milk m1 = new Milk("white");
	Soser s1 = new Soser("blue");

	Cup(String color)
	{
		this.color = color;
	}
	public void coffe() 
	{
		m1.milk();
		s1.Sclr();
	}
	public void Tea()
	{
		m1.boost();
		s1.helps();
	}
}
