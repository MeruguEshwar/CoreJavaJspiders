class Rect
{
	
	double length;
	double breadth;
	String color;

	Rect(double length,double breadth,String color)
	{
		this.length = length;
		this.breadth = breadth;
		this.color = color;
	}

	Rect(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void Area() 
	{
		
		System.out.println(length*breadth);
		
		if(color == null)
		{
			System.out.println("red");
		}

	}

	public static void main(String[] args) 
	{
		Rect s1=new Rect(2.2,3.1,"red");
		s1.Area();

		Rect s2=new Rect(4.3,2.1);
		s2.Area();
	}
}
