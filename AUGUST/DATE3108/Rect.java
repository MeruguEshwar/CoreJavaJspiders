class Rect 
{
	int l;
	int b;
	String c;
	Rect(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	Rect(int l,int b,String c)
	{
		this(l,b);
		this.c=c;
	}
	public void rectInfo()
	{
		System.out.println("length :"+l);
		System.out.println("breadth :"+b);
		if(c != null)
		{
			System.out.println("color :"+c);
		}
	}
	public static void main(String[] args) 
	{
		Rect r1 = new Rect(8,2);
		Rect r2 = new Rect(8,2,"red");
		r1.rectInfo();
		r2.rectInfo();
	}
}
