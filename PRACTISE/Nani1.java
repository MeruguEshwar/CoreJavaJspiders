class Nani1 
{
	static int a=5;
	 int b;
	public void chotu(int b)
	{
		this.b=b;
	}
	public  void nani()
	{
		double area=0.5*a*b;
		System.out.println("area of an triangle="+area);
	}
	public static void main(String[] args) 
	{
		Nani1 obj=new Nani1(2);
		obj.nani();
	}
}
