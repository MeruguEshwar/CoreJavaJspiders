class Circle 
{
	static double pi = 3.14; 

	int r;

	Circle(int a)
	{
		r=a;
	}
	public void nani()
	{
		System.out.println(pi*r*r);
	}
	public static void main(String[] args) 
	{
		Circle c1=new Circle(5);
		Circle c2=new Circle(8);
		Circle c3=new Circle(9);
		Circle c4=new Circle(11);
		c1.nani();
		c2.nani();
		c3.nani();
		c4.nani();
	}
}
