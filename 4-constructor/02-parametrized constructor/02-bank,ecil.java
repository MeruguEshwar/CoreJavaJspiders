public class bank
{
	private String name;
	private int acno;
	public bank(String name,int acno)
	{
		this.name=name;
		this.acno=acno;
	}
	public void printbank()
	{
		System.out.print("\n name="+name+"\n acno="+acno);
	}
}
class bank1
{
	public static void main(String argv[]) 
	{
		bank b1=new bank("eshwar",143210);
		bank b2=new bank("nani",153210);
		bank b3=new bank("raju",116324);
		System.out.print("\n b1...");b1.printbank();
		b2.printbank();
		b3.printbank();
	}
}
