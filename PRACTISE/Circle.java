class Circle
{
	double length;
	int breadth;
	Circle(double a,int b)
	{
		length=a;
		breadth=b;
	}
	public void area()
	{
		System.out.println(length*breadth);
	}
	public static void main(String[] args) 
	{
		Circle c1=new Circle(2,3);
		c1.area();

		Circle c2=new Circle(2,4);
		c2.area();
	}
}
