class sample
{
	private String name;
	private int rn,sub1,sub2;
	private double avg;
	public void setstudent(String name,int rn,int sub1,int sub2)
	{
		this.name=name;
		this.rn=rn;
		this.sub1=sub1;
		this.sub2=sub2;
	}
	public void printstudent()
	{
		System.out.print("\n name="+name);
		System.out.print("\n rn="+rn);
		System.out.print("\n sub1="+sub1);
		System.out.print("\n sub2="+sub2);
	}
}
class edit
{
	public static void main(String argv[])
	{
		sample obj=new sample();
		obj.setstudent("eshwar",20,90,98);
		obj.printstudent();
	}
}
