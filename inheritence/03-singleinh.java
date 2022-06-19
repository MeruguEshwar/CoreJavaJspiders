class a
{
	private String name;
	private int rn;
	public void setstudent(String name,int rn)
	{
		this.name=name;
		this.rn=rn;
	}
	public void printstudent()
	{
		System.out.print("\n name="+name +"\n rn="+rn);
	}
}
class marks extends a
{
	private int m1,m2;
	public void setmarks(int m1,int m2)
	{
		this.m1=m1;
		this.m2=m2;
	}
	public void printmarks()
	{
		System.out.print("\n m1="+m1 +"\n m2="+m2);
	}
}
class singleinh
{
	public static void main(String argv[])
	{
		marks obj=new marks();
		obj.setstudent("eshwar",5);
		obj.setmarks(10,20);
		obj.printstudent();
		obj.printmarks();
	}
}
		
