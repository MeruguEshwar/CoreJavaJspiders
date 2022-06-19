class bank
{
	private String name;
	private int accno;
	public bank(String name,int accno)
	{
		this.name=name;
		this.accno=accno;
	}
	public void printbank()
	{	
		System.out.print("\n name="+name +"accno="+accno);
	}
}
class bank
{
	public static void main(String argv)
	{
		bank b1=new bank("Raju",109);
		bank b2=new bank("kumar",9.5);
		System.out.print("\n b1....");b1.printbankj();
		System.out.print("\n b2....");b2.printbank();
	}
}
