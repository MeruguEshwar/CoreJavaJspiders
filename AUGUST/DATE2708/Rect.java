class Rect
{
	double length;
	int breadth;
	Rect(double length,int breath)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public void printPerimeter()
	{
		System.out.println(2*(length+breadth));
	}
	public static void main(String[] args) 
	{
		Rect A1=new Rect(5.5,3);
		Rect A2=new Rect(6.5,2);
		Rect A3=new Rect(7.5,4);
	
		A1.printPerimeter();
		A2.printPerimeter();
		A3.printPerimeter();
	}
}
